package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Item implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@OneToOne
	private Producto producto;
	private int cantidad;
	private int valor_total;
	@ManyToOne
	private Factura factura;
	
	public Item(Producto producto, int cantidad, int valor_total) {
		
		this.producto = producto;
		this.cantidad = cantidad;
		this.valor_total = valor_total;
		
	}

	

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getValor_total() {
		return valor_total;
	}

	public void setValor_total(int valor_total) {
		this.valor_total = valor_total;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", producto=" + producto + ", cantidad=" + cantidad + ", valor_total=" + valor_total
				+ ", factura=" + factura + "]";
	}

	
	
	
	
	
}
