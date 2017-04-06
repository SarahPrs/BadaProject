package com.bada_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bada_project.model.Seance;
import com.bada_project.model.Vtagenda;
import com.bada_project.repository.SeanceRepository;
import com.bada_project.repository.VtagendaRepository;

@Controller
public class VtagendaController {
	
	@Autowired
	VtagendaRepository vtagendaRepository;
	
	@Autowired
	SeanceRepository seanceRepository;
	
	@RequestMapping(value="/sauvegarde", method=RequestMethod.GET)
	public ModelAndView showPageInfoSauvegarde()
	{
		ModelAndView mv = new ModelAndView("sauvegarde");
		List<Vtagenda> vtagenda = vtagendaRepository.findAll();
		mv.addObject("sauvegarde", vtagenda.get(0).getDATA_VISUAL_TIMETABLING().getSauvegarde());
		return mv;
		
	}
	
}
