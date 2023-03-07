package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.AddPackage;
import com.example.demo.entities.PlannedTour;
@Transactional
@Repository
public interface PlannedTourRepository extends JpaRepository<PlannedTour, Integer> 
{
	@Query("SELECT p FROM PlannedTour p where p.status = 0")
	public List<PlannedTour> getAllPlanTour();

	@Modifying
	@Query("update PlannedTour p set p.status =1 where p.tour_id =:id")
	public int approveTour(int id);
	
	@Query(nativeQuery=true,value="select * from plannedtour  where packageid in(select package_id from package where locations like %:loc% ) and status=1")
	public List<PlannedTour> getAllPackagesByLocation(String loc);

}
