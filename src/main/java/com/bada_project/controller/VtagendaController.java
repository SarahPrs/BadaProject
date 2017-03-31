package com.bada_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bada_project.model.Vtagenda;
import com.bada_project.repository.VtagendaRepository;

@Controller
public class VtagendaController {
	
	@Autowired
	VtagendaRepository vtagendaRepository;
	
	@RequestMapping(value="/vtagenda", method=RequestMethod.GET)
	public ModelAndView showPageSauvegarde()
	{
		ModelAndView mv = new ModelAndView("vtagenda");
		Vtagenda vtagenda = vtagendaRepository.findOne("58ddfe2adf1260f1138e1e99");
		mv.addObject("vtagenda",vtagenda);
		return mv;
		
		
	}

}
