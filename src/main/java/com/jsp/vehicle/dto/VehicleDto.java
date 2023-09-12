package com.jsp.vehicle.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VehicleDto implements Serializable {

	private String name ;
	
	private String phoneNumber ;
	
	private String vehicleNumber ; 
	
	private int vehicleType ;
	
}
