package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.PlannedTour;
@Repository
public interface PlannedTourRepository extends JpaRepository<PlannedTour, Integer> 
{
	

}
