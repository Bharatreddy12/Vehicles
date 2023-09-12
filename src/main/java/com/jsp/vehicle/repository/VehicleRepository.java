package com.jsp.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.vehicle.entity.VehicleEntity;

public interface VehicleRepository extends JpaRepository<VehicleEntity, Integer>
{	
	public List<VehicleEntity> findByName(String name);

	public VehicleEntity findByVehicleNumber(String vehicleNumber);
}


