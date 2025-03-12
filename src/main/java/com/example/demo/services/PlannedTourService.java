package com.example.demo.services;

import java.util.List;

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

	public List<PlannedTour> getAllPlanTour() {
		// TODO Auto-generated method stub
		return plannedtourrepo.getAllPlanTour();
	}

	public int approveTour(int id) {
		// TODO Auto-generated method stub
		return plannedtourrepo.approveTour(id);
	}

	public List<PlannedTour> getAllPackagesByLocation(String loc) {
		// TODO Auto-generated method stub
		return plannedtourrepo.getAllPackagesByLocation(loc);
	}
	
	

}
