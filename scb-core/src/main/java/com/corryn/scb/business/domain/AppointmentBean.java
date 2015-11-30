package com.corryn.scb.business.domain;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Inject;

import com.corryn.scb.data.dao.domain.AppointmentDAO;
import com.corryn.scb.data.persistence.model.AppointmentEntity;

/**
 * @author GH29142
 *
 */
@Stateless
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class AppointmentBean
{
	@Inject
	private AppointmentDAO appointmentDAO;

	/**
	 * saveAppointment
	 * @param entity entity
	 * @return AppointmentDTO
	 */
	public AppointmentEntity saveAppointment(AppointmentEntity entity)
	{
		if(entity.getId() == null)
		{
			this.appointmentDAO.persist(entity);
		}
		else
		{
			this.appointmentDAO.merge(entity);
		}
		return entity;
	}

	/**
	 * deleteAppointment
	 * @param entity entity
	 */
	public void deleteAppointment(AppointmentEntity entity)
	{
		AppointmentEntity entityRef = this.appointmentDAO.findEntity(entity.getId());
		this.appointmentDAO.remove(entityRef);
	}

	/**
	 * getAppointments
	 * @return List<AppointmentDTO>
	 */
	public List<AppointmentEntity> getAppointments()
	{
		return this.appointmentDAO.findAllEntities();
	}

	/**
	 * getCurrentAppointments
	 * @return List<AppointmentDTO>
	 */
	public List<AppointmentEntity> getCurrentAppointments()
	{
		return this.appointmentDAO.findCurrentAppointments();
	}
}
