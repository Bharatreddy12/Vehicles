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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "bill_info")
public class BillEntity implements Serializable{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "bill_id")
	private Integer billId ;
	
	@Column(name = "vehicle_number")
	private String vehicleNumber ;
	
	@Column(name = "vehicle_type")
	private int vehicleType ;
	
	@Column(name = "in_time")
	private LocalTime inTime ;
	
	@Column(name = "out_time")
	private LocalTime outTime ;
	
	@Column(name = "date")
	private String date ;
	
	@Column(name = "price")
	private Double price ;
	
	@Column(name = "total_price")
	private Double totalPrice ;
	
}
