package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.AddPackage;
import com.example.demo.entities.Address;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Login;
import com.example.demo.entities.PlannedPackageDummy;
import com.example.demo.entities.PlannedTour;
import com.example.demo.entities.Role;
import com.example.demo.entities.Tourist;
import com.example.demo.services.EmployeeService;
import com.example.demo.services.PackageService;
import com.example.demo.services.PlannedTourService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PlannedTourController 
{
	@Autowired
	PlannedTourService ptserv;
	
	@Autowired
	EmployeeService empserv;
	
	@Autowired
	PackageService packageserv;
	
	@PostMapping("/addPlannedTour")
	public PlannedTour addPackage(@RequestBody PlannedPackageDummy packagedummy)
	{
		System.out.println("----------");
		System.out.println(packagedummy);
		
		
		System.out.println("---------------------"+packagedummy.getPackageidobj());
		
		 
		Employee employee = empserv.getEmpInfo(packagedummy.getEmployeeid());
		
		
		
		AddPackage adpkg = packageserv.getPackageInfo(packagedummy.getPackageidobj());
	
		PlannedTour plantour = new PlannedTour(packagedummy.getStartdate(),packagedummy.getLastdate(),packagedummy.getAvailseats(), packagedummy.getLastdate_apply(), adpkg, employee);
		
		System.out.println("***********"+adpkg+"***********");
		PlannedTour demo = ptserv.save(plantour);
		
		System.out.println("in planned tour controller ----"+demo);
		
		return demo;
		
		
	}

}

/*{
        
        "startdate":"1998-05-25",
        "lastdate":"1998-05-25",
        "availseats":50,
        "lastdate_apply":"1998-05-25",
        "packageidobj": 3,
        "employeeid":1       
       
    }*/