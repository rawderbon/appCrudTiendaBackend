package com.example.demo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Factura implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String cliente;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true ,mappedBy = "factura")
	private List<Item> items;
	private int valor_total;
	
	public Factura(String cliente, List<Item> items, int valor_total) {
		super();
		this.cliente = cliente;
		this.items = items;
		this.valor_total = valor_total;
	}

	public Factura() {
		this.cliente="";
		this.items=null;
		this.valor_total=0;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getValor_total() {
		return valor_total;
	}

	public void setValor_total(int valor_total) {
		this.valor_total = valor_total;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", cliente=" + cliente + ", items=" + items + ", valor_total=" + valor_total + "]";
	}

	
	
	
	
}
