package com.nagarro.professionals.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.professionals.entities.Professional;
import com.nagarro.professionals.services.ProfessionalService;

@RestController
@RequestMapping(value = "/professional")
@CrossOrigin
public class ProfessionalController {
	
	@Resource
	public ProfessionalService professionalservice;
	
	@GetMapping(value = "{proId}")
	public Professional getProfessionalDetails(@PathVariable(value = "proId") final int proId) {
		
		try {
			
			return professionalservice.getProfessionalDetail(proId);
			
		} catch (final Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping(value = "{work}/{area}")
	public Professional getProfessionalByWorkAndArea(@PathVariable(value = "work")final String work, @PathVariable(value = "area") final String area){
		
		try {
					
				return professionalservice.getProfessionalByWorkAndArea(work, area);
				
			} catch (final Exception e) {
				
				e.printStackTrace();
			}
			return null;		
	}

}
