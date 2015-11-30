package com.corryn.scb.data.dao;

import com.corryn.scb.data.persistence.SCBDatabase;
import com.corryn.scb.data.persistence.model.IdEntity;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public abstract class BaseDAOImpl<T extends IdEntity> implements BaseDAO<T> {
	@Inject
	@SCBDatabase
	private EntityManager entityManager;

	public T findEntity(Long id) {
		return (T) getEntityManager().find(getEntityClass(), id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAllEntities() {
		Criteria criteria = getHibernateSession().createCriteria(
				getEntityClass());
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public T findEntityByAttribute(String propertyName, Object propertyValue) {
		Criteria criteria = getHibernateSession().createCriteria(
				getEntityClass());
		criteria.add(Restrictions.eq(propertyName, propertyValue));
		Object result = criteria.uniqueResult();
		if (result != null) {
			return (T) result;
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<T> findEntitiesByAttribute(String propertyName,
			Object propertyValue) {
		Criteria criteria = getHibernateSession().createCriteria(
				getEntityClass());
		criteria.add(Restrictions.eq(propertyName, propertyValue));
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	public List<T> findEntitiesByAttributes(Map<String, Object> properties) {
		Criteria criteria = getHibernateSession().createCriteria(
				getEntityClass());
		for (Map.Entry<String, Object> property : properties.entrySet()) {
			criteria.add(Restrictions.eq((String) property.getKey(),
					property.getValue()));
		}
		return criteria.list();
	}

	public T save(T entity) {
		if (entity.getId() == null) {
			return persist(entity);
		}
		return merge(entity);
	}

	public T persist(T entity) {
		getEntityManager().persist(entity);
		return entity;
	}

	public T merge(T entity) {
		getEntityManager().merge(entity);
		return entity;
	}

	public void refresh(T entity) {
		getEntityManager().refresh(entity);
	}

	public void remove(T entity) {
		getEntityManager().getReference(getEntityClass(), entity.getId());
		getEntityManager().remove(entity);
	}

	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	public Session getHibernateSession() {
		return (Session) this.entityManager.unwrap(Session.class);
	}
}
