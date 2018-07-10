package com.tacofy.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The persistent class for the taco_tipo database table.
 * 
 */
@Entity
@Table(name="taco_tipo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TacoTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="taco_tipo_id")
	private int tacoTipoId;

	private String descripcion;

	public TacoTipo() {
	}

	public int getTacoTipoId() {
		return this.tacoTipoId;
	}

	public void setTacoTipoId(int tacoTipoId) {
		this.tacoTipoId = tacoTipoId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}