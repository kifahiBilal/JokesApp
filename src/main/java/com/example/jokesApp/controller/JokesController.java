package com.example.jokesApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jokesApp.service.JokesServiceImpl;

@Controller
public class JokesController {

	private JokesServiceImpl jokesService;
	
	public JokesController(JokesServiceImpl jokesService) {
		this.jokesService = jokesService;
	}
	
    @RequestMapping({"/", ""})
	public String getJoke(Model model) {
		model.addAttribute("joke", jokesService.getChuckJoke());
		return "joke";
	}
}
