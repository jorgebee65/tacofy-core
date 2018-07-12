package com.tacofy.bo;

public class BaseBO {
	
	private Long id;
	private String descripcion;
	
	public BaseBO () {}
	
	public BaseBO (Long id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
