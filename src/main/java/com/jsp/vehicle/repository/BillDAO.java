package com.jsp.vehicle.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.vehicle.entity.BillEntity;

@Repository
public class BillDAO {
	
	@Autowired
	private BillRepository billRepository ;
	
	public BillEntity saveBill(BillEntity billEntity)
	{
		System.err.println(billEntity);
		return billRepository.save(billEntity) ;
	}

}
