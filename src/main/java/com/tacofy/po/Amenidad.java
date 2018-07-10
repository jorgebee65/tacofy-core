package com.tacofy.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The persistent class for the amenidad database table.
 * 
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Amenidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="amenidad_id")
	private int amenidadId;

	private String descripcion;

	public Amenidad() {
	}

	public int getAmenidadId() {
		return this.amenidadId;
	}

	public void setAmenidadId(int amenidadId) {
		this.amenidadId = amenidadId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}