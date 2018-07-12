package com.tacofy.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the amenidad database table.
 * 
 */
@Entity
@Table(name="amenidad")
public class AmenidadPO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="amenidad_id")
	private Long amenidadId;

	private String descripcion;
	
	public Long getAmenidadId() {
		return this.amenidadId;
	}

	public void setAmenidadId(Long amenidadId) {
		this.amenidadId = amenidadId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}