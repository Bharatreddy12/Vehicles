package com.jsp.vehicle.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicle_details")
public class VehicleEntity  implements Serializable{
	
	@Id
	@Column(name = "token_number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tokenNumber ;
	
	@Column(name = "name")
	private String name ;
	
	@Column(name = "phone_number")
	private String phoneNumber ;
	
	@Column(name = "vehicle_number")
	private String  vehicleNumber ;
	
	@Column(name = "vehicle_type")
	private int vehicleType ;
	
	@Column(name = "is_vehicle_present")
	private String isVehiclePresent ;
	
	@Column(name = "date")
	private String date;
	
	@Column(name = "in_time")
	private LocalTime inTime ;
	
}
