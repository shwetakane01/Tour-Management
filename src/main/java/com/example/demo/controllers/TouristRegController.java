package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Address;
import com.example.demo.entities.Login;
import com.example.demo.entities.Role;
import com.example.demo.entities.Tourist;
import com.example.demo.entities.TouristReg;
import com.example.demo.services.AddressService;
import com.example.demo.services.LoginService;
import com.example.demo.services.RoleService;
import com.example.demo.services.TouristRegService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TouristRegController 
{
	@Autowired
	TouristRegService trstserv;
	
	@Autowired
	RoleService roleservice;

	@Autowired
	LoginService lservice;
	
	@Autowired
	AddressService aservice;
	
	@PostMapping("/touristReg")
	public Tourist regTourist(@RequestBody TouristReg treg)
	
	{
		
		System.out.println(treg);
		Role r = roleservice.getRole(1);
		Login l = new Login(treg.getUid(),treg.getPwd(),0,r);
		
		Login lsaved = lservice.save(l);
		
		Address addr = new Address(treg.getAddressline(),treg.getDistrict(),treg.getCity(),treg.getState(),treg.getCountry(),treg.getPostalcode());
	
		Address asaved = aservice.save(addr);
		
		Tourist t = new Tourist(treg.getFname(),treg.getLname(),treg.getEmail(),treg.getContact(),asaved,lsaved);
		return trstserv.saveTourist(t);
		
	
		
	}
}