package com.tacofy.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the taco_tipo database table.
 * 
 */
@Entity
@Table(name="taco_tipo")
public class TacoTipoPO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="taco_tipo_id")
	private Long tacoTipoId;

	private String descripcion;

	public TacoTipoPO() {
	}

	public Long getTacoTipoId() {
		return this.tacoTipoId;
	}

	public void setTacoTipoId(Long tacoTipoId) {
		this.tacoTipoId = tacoTipoId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}