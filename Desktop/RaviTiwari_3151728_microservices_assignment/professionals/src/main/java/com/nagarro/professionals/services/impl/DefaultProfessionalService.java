package com.nagarro.professionals.services.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


import com.nagarro.professionals.entities.Professional;
import com.nagarro.professionals.services.ProfessionalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class DefaultProfessionalService implements ProfessionalService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static List<Professional> professionals = new ArrayList<Professional>() {
		/**
		 *
		 */
		private static final long serialVersionUID = 3248390977534695954L;

		{
			add(new Professional(1, "ganshyam", 32, "abc@gmail.com", "Barber", "Delhi"));
			add(new Professional(2, "akshay", 22, "abdc@gmail.com", "Electrician", "Mumbai"));
			add(new Professional(3, "vimala", 22, "abdcd@gmail.com", "Beautician", "Haryana"));

		}
	};
	
	
	@Override
	public Professional getProfessionalDetail(int proId) {
		// TODO Auto-generated method stub
		
		try {
			for (Professional professional : professionals) {
				if (professional.getProId()==proId) {
					return professional;
				}
			}
			return null;
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	@Override
	public Professional getProfessionalByWorkAndArea(String work, String area) {
		try {
//			List<Professional> prosByArea = new ArrayList<Professional>();
			System.out.println(area);
			for (Professional professional : professionals) {
				System.out.println(professional.getArea().equalsIgnoreCase(area));
				if (professional.getArea().equalsIgnoreCase(area) && professional.getJobName().equalsIgnoreCase(work)) {
					System.out.println(professional.getArea());
					return professional;
				}
			}
			return null;
		} catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
