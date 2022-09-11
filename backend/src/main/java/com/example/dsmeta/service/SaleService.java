package com.example.dsmeta.service;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.dsmeta.entities.Sale;
import com.example.dsmeta.repository.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);								
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		
		// no codigo acima, é feito um if ternário, onde se o min date for nulo, ou seja, se 
		// não foi enviado um min date, é enviado um today, que é o instante atual menos 365 dias
		// puxando os dados mínimos de um ano atrás, e como dados máximos, o dia de hoje.
		
		// converte o minDate (string) para uma data na forma de LocalDate
		
		return saleRepository.findSales(min, max, pageable);
	}
	
}
