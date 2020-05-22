package com.example.demo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Producto implements Serializable{
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final int valor;
       
    
	public Producto() {
		this.name = "";
		this.valor = 0;
		
	}

	public Producto( String name, int valor) {
     	
		this.valor = valor;
		
		this.name = name;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", name=" + name + ", valor=" + valor + "]";
	}
	
    
}