package com.example.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Soy un titulo");
		model.addAttribute("saludo", "Hola, Código Facilito");
		model.addAttribute("show", false);
		//List<String> series = List.of("Dexter", "Game of Thrones", "Vikings");
		//model.addAttribute("series", series);
		return "index";
	}
	
	@GetMapping(value = "/index-mv")
	public ModelAndView indexMV(ModelAndView mv) {
		mv.addObject("titulo","Titulo de MV");
		mv.addObject("saludo","Saludo de MV");
		mv.addObject("show",true);
		//List<String> series = List.of("Dexter", "Game of Thrones", "Vikings");
		//mv.addObject("series",series);
		mv.setViewName("index");
		return mv;
	}
	
	@ModelAttribute("series")
	public List<String> getSeries(){
		return List.of("Dexter", "Game of Thrones", "Vikings", "Flash", "The Last Of Us");
	}
	
	@PostMapping(value="/index-req-mapping")
	public String indexRequestMapping() {
		return "index2";
	}

}
