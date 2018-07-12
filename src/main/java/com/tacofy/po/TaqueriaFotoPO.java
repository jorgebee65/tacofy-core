package com.tacofy.po;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the taqueria_fotos database table.
 * 
 */
@Entity
@Table(name="taqueria_fotos")
public class TaqueriaFotoPO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="taq_foto_id")
	private Long taqFotoId;

	private String ruta;

	private TaqueriaPO taqueria;

	public TaqueriaFotoPO() {
	}

	public Long getTaqFotoId() {
		return this.taqFotoId;
	}

	public void setTaqFotoId(Long taqFotoId) {
		this.taqFotoId = taqFotoId;
	}

	public String getRuta() {
		return this.ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public TaqueriaPO getTaqueria() {
		return this.taqueria;
	}

	public void setTaqueria(TaqueriaPO taqueria) {
		this.taqueria = taqueria;
	}

}