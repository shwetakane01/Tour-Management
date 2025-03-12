package com.example.demo.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="package")
public class AddPackage {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int package_id;
	
	@Column
	String packagename;
	
	@Column
	double packageprice;
	
	@Column
	byte[] packageimages;
	 
	
	@Column
	String duration;
	
	@Column
	int tourist_capacity;
	
	@Column
	String description;
	
	@Column
	String locations;

	public AddPackage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddPackage(int package_id, String packagename, double packageprice, byte[] packageimages, String duration,
			int tourist_capacity, String description, String locations) {
		super();
		this.package_id = package_id;
		this.packagename = packagename;
		this.packageprice = packageprice;
		this.packageimages = packageimages;
		this.duration = duration;
		this.tourist_capacity = tourist_capacity;
		this.description = description;
		this.locations = locations;
	}

	
	public AddPackage(String packagename, double packageprice, String duration, int tourist_capacity,
			String description, String locations) {
		super();
		this.packagename = packagename;
		this.packageprice = packageprice;
		this.duration = duration;
		this.tourist_capacity = tourist_capacity;
		this.description = description;
		this.locations = locations;
	}

	public int getPackage_id() {
		return package_id;
	}

	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}

	public String getPackagename() {
		return packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	public double getPackageprice() {
		return packageprice;
	}

	public void setPackageprice(double packageprice) {
		this.packageprice = packageprice;
	}

	public byte[] getPackageimages() {
		return packageimages;
	}

	public void setPackageimages(byte[] packageimages) {
		this.packageimages = packageimages;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getTourist_capacity() {
		return tourist_capacity;
	}

	public void setTourist_capacity(int tourist_capacity) {
		this.tourist_capacity = tourist_capacity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocations() {
		return locations;
	}

	public void setLocations(String locations) {
		this.locations = locations;
	}

	@Override
	public String toString() {
		return "Package [package_id=" + package_id + ", packagename=" + packagename + ", packageprice=" + packageprice
				+ ", packageimages=" + Arrays.toString(packageimages) + ", duration=" + duration + ", tourist_capacity="
				+ tourist_capacity + ", description=" + description + ", locations=" + locations + "]";
	}
	
	
	

	

	
	
	
	
	
}