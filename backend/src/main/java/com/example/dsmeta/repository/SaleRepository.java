package com.example.dsmeta.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.dsmeta.entities.Sale;

// componente do sistema responsavel por acessar o banco de dados
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query(value=" SELECT obj FROM Sale obj " + 
				 " WHERE obj.date BETWEEN :min AND :max " + 
				 " ORDER BY obj.amount DESC ")
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);

}
