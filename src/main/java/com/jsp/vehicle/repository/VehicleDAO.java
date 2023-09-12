package com.jsp.vehicle.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.vehicle.entity.BillEntity;
import com.jsp.vehicle.entity.VehicleEntity;

@Repository
public class VehicleDAO  {
	
	@Autowired
	private VehicleRepository vehicleRepository ;

	public VehicleEntity saveVehicle(VehicleEntity vehicleEntity)
	{
		return vehicleRepository.save(vehicleEntity);
	}
	public Optional<VehicleEntity> getVehicleByTokenNumber(int id)
	{
		return vehicleRepository.findById(id);
	}
	
	public VehicleEntity getVehicleByVehicleNumber(String number)
	{
		return vehicleRepository.findByVehicleNumber(number);
	}
	
	
}
