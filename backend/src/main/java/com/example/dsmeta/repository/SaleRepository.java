package com.example.dsmeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dsmeta.entities.Sale;

// componente do sistema responsavel por acessar o banco de dados
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
