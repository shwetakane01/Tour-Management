package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Tourist;
import com.example.demo.repositories.TouristRegRepository;

@Service
public class TouristRegService 
{
	@Autowired
	TouristRegRepository regrepo;

	public Tourist saveTourist(Tourist d)
	{
		return regrepo.save(d);
	}
	
}