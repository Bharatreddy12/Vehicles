package com.jsp.vehicle.service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.vehicle.dto.BillDto;
import com.jsp.vehicle.entity.BillEntity;
import com.jsp.vehicle.entity.VehicleEntity;
import com.jsp.vehicle.repository.BillDAO;

@Service
public class BillService {

	@Autowired
	private BillDAO dao;

	@Autowired
	private VehicleService vehicleService;

	public BillEntity saveBill(BillDto billDto) {
		VehicleEntity vehicleEntity = vehicleService.getVehicleByVehicleNumber(billDto.getVehicleNumber());

		BillEntity bill = new BillEntity();

		bill.setVehicleNumber(vehicleEntity.getVehicleNumber());
		bill.setVehicleType(vehicleEntity.getVehicleType());
		bill.setInTime(vehicleEntity.getInTime());
		bill.setOutTime(LocalTime.now());
		bill.setDate(LocalDate.now().toString());
		if (vehicleEntity.getVehicleType() == 2) {
			bill.setPrice(10.00);
			Duration d= Duration.between(bill.getInTime(), bill.getOutTime());
			System.out.println(d);
			System.out.println(d.toMinutes());
			Double parkingCharge = parkingCharge(d.toMinutes(),vehicleEntity.getVehicleType());
			bill.setTotalPrice(parkingCharge);
			
		} else {
			bill.setPrice(20.00);
			Duration d= Duration.between(bill.getInTime(), bill.getOutTime());
			Double parkingCharge = parkingCharge(d.toMinutes(),vehicleEntity.getVehicleType());
			bill.setTotalPrice(parkingCharge);
		}
		  return dao.saveBill(bill);
	}

	private Double parkingCharge(Long duration, int type) {
		
		long time = duration ;
		int charge = 0;
		
		if (type == 2)charge = 10;
		else charge = 20;

		double interval = (time/ 30);
		
		System.out.println(interval);

		return interval * charge;
	}

}
