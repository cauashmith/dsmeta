package com.example.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // com essa anotacao, essa classe seja equivalente a uma tabela de um banco de dados
@Table(name = "tb_sales")
public class Sale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;			// id do vendedor
	private String sellerName;  // nome do vendedor
	private Integer visited;   	// visitas
	private Integer deals;		// vendas
	private Double amount;		// total
	private LocalDate date;		// data
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public Integer getVisited() {
		return visited;
	}
	public void setVisited(Integer visited) {
		this.visited = visited;
	}
	public Integer getDeals() {
		return deals;
	}
	public void setDeals(Integer deals) {
		this.deals = deals;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
