package com.jsp.vehicle.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.vehicle.dto.VehicleDto;
import com.jsp.vehicle.entity.VehicleEntity;
import com.jsp.vehicle.repository.VehicleDAO;

@Service
public class VehicleService {

	@Autowired
	private VehicleDAO dao ;
	
	public VehicleEntity saveVehicle(VehicleDto dto)
	{
		VehicleEntity v = new VehicleEntity();
		
		v.setName(dto.getName());
		v.setPhoneNumber(dto.getPhoneNumber());
		v.setVehicleNumber(dto.getVehicleNumber());
		v.setVehicleType(checkVehicleType(dto.getVehicleType()));
		v.setIsVehiclePresent("yes");
		v.setInTime(LocalTime.now());
		v.setDate(LocalDate.now().toString());
		return dao.saveVehicle(v);
	}
	public  Optional<VehicleEntity> getVehicleByTokenNumber(int id)
	{
		return dao.getVehicleByTokenNumber(id);
	}
	public VehicleEntity getVehicleByVehicleNumber(String vehicleNumber)
	{
		return dao.getVehicleByVehicleNumber(vehicleNumber);		
	}
	
	private Integer checkVehicleType(int type) {
		if(type==2) return 2 ;
		
		else return 4 ;
		
	}
}
