package com.practica_3.app.models.dao;

import java.util.List;

import com.practica_3.app.models.entities.Consultation;

public interface IConsultationDao {

	public List<Consultation> findAll();
}
