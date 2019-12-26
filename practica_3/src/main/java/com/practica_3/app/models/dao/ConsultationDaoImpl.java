package com.practica_3.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.practica_3.app.models.entities.Consultation;

@Repository
public class ConsultationDaoImpl implements IConsultationDao {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Consultation> findAll() {
		
		return em.createQuery("from Consultation").getResultList();
	}

}
