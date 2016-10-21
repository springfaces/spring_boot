package com.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.StatusUpdate;
import com.test.service.StatusUpdateService;

@Controller
@Configuration
@ComponentScan("com.test.service")
public class HelloController {

	
	@Autowired
	private StatusUpdateService statusUpdateService;

	
	@RequestMapping("/index")
	public String index(Model model, @RequestParam(value="name", required=false, defaultValue="world")String name) {
			statusUpdateService.save(new StatusUpdate("testing from controller"));
			model.addAttribute("name", name);
			System.out.println(statusUpdateService.getLatest().getId());
			return "index";
	}
	
	
	
	
}
