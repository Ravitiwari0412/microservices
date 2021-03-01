package com.nagarro.professionals.services;

import java.util.List;

import com.nagarro.professionals.entities.Professional;

public interface ProfessionalService {
	
	Professional getProfessionalDetail(int proId);
	
	Professional getProfessionalByWorkAndArea(String work, String area);
	
	

}
