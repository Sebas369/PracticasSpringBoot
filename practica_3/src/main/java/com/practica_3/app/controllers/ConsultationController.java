package com.practica_3.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practica_3.app.models.dao.IConsultationDao;

@Controller
public class ConsultationController {
	
	@Autowired
	private IConsultationDao consultationDao;

	@RequestMapping(value="/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		
		model.addAttribute("titulo", "Listado de módulos");
		model.addAttribute("modulos", consultationDao.findAll());
		
		return "listar";
	}
}
