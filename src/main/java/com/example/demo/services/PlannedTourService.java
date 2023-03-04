package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.PlannedTour;
import com.example.demo.entities.Tourist;
import com.example.demo.repositories.PlannedTourRepository;

@Service
public class PlannedTourService 
{
	@Autowired
	PlannedTourRepository plannedtourrepo;
	
	public PlannedTour save (PlannedTour d)
	{
		return plannedtourrepo.save(d);
	}
	
	

}
