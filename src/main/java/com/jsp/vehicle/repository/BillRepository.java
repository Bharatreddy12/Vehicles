package com.jsp.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.vehicle.entity.BillEntity;

public interface BillRepository extends JpaRepository<BillEntity, Integer> {
	

}
