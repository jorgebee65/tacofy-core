package com.tacofy.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the taqueria_tipo database table.
 * 
 */
@Entity
@Table(name="taqueria_tipo")
public class TaqueriaTipoPO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="taq_tipo_id")
	private Long taqTipoId;

	private String descripcion;

	public TaqueriaTipoPO() {
	}

	public Long getTaqTipoId() {
		return this.taqTipoId;
	}

	public void setTaqTipoId(Long taqTipoId) {
		this.taqTipoId = taqTipoId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}