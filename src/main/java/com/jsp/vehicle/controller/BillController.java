package com.jsp.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.vehicle.dto.BillDto;
import com.jsp.vehicle.entity.BillEntity;
import com.jsp.vehicle.service.BillService;

@RestController
public class BillController {

	@Autowired
	private BillService billService ;
	
	@PostMapping(value = "/savebill")
	public BillEntity saveBill(@RequestBody BillDto billDto)
	{
		System.out.println("Hyyyyyyyyyy");
		return billService.saveBill(billDto);
	}
}
