package com.corryn.scb.data.persistence;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityManagerProducer {
	@Produces
	@PersistenceContext(unitName = "scb-core")
	@SCBDatabase
	private EntityManager entityManager;
}
