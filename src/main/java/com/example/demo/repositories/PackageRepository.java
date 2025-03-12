package com.example.demo.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.AddPackage;
@Transactional
@Repository
public interface PackageRepository extends JpaRepository<AddPackage, Integer>
{

	@Modifying
	@Query("update AddPackage p set p.packageimages =:file where p.package_id =:id")
	public int uploadPhoto(int id,byte [] file);
}
