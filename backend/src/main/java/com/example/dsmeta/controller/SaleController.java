package com.example.dsmeta.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsmeta.entities.Sale;
import com.example.dsmeta.service.SaleService;
import com.example.dsmeta.service.SmsService;

@RestController
@RequestMapping(value="/sales")
public class SaleController {

	@Autowired
	SaleService saleService;
	
	@Autowired
	SmsService smsService;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value="minDate", defaultValue="") String minDate, 
			@RequestParam(value="maxDate", defaultValue="") String maxDate, 
			Pageable pageable) {  //PAGEABLE PAGEIA OS ELEMENTOS DE 20 EM VINTE, POR EXEMPLO, SE TEM 10000 VENDAS NO BANCO, ELE PAGEIA DE 20 EM 20
		return saleService.findSales(minDate, maxDate, pageable);
	}
	
	@GetMapping("/{id}/notification")
	public void notifySms(@PathVariable Long id) {
		smsService.sendSms(id);
	}
	
}
