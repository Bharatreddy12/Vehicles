package com.jsp.vehicle.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BillDto implements Serializable{
	
	private String vehicleNumber ;

}
