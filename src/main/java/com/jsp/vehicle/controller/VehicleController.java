package com.jsp.vehicle.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.vehicle.dto.VehicleDto;
import com.jsp.vehicle.entity.VehicleEntity;
import com.jsp.vehicle.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	private VehicleService service ;
	
	@PostMapping(value = "/savevehicle")
	public VehicleEntity saveVehicle(@RequestBody VehicleDto dto)
	{
		return service.saveVehicle(dto);
	}
	
	@GetMapping(value = "/getdetails/{id}")
	public Optional<VehicleEntity> getVehicleDetailsById(@PathVariable("id") int id)
	{
		return service.getVehicleByTokenNumber(id);
	}
	
	@GetMapping(value = "/getdetailsbynumber/{vehicleNumber}")
	public VehicleEntity getVehicleByVehicleNumber(@PathVariable("vehicleNumber") String vehicleNumber)
	{
		return service.getVehicleByVehicleNumber(vehicleNumber);
	}
}
