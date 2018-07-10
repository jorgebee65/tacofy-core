package com.tacofy.po;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The persistent class for the taqueria_fotos database table.
 * 
 */
@Entity
@Table(name="taqueria_fotos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TaqueriaFoto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="taq_foto_id")
	private int taqFotoId;

	private String ruta;

	private Taqueria taqueria;

	public TaqueriaFoto() {
	}

	public int getTaqFotoId() {
		return this.taqFotoId;
	}

	public void setTaqFotoId(int taqFotoId) {
		this.taqFotoId = taqFotoId;
	}

	public String getRuta() {
		return this.ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public Taqueria getTaqueria() {
		return this.taqueria;
	}

	public void setTaqueria(Taqueria taqueria) {
		this.taqueria = taqueria;
	}

}