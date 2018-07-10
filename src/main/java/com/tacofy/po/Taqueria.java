package com.tacofy.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Taqueria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="taq_id")
	private Long taqId;

	private BigDecimal calificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	private BigDecimal latitud;

	private BigDecimal longitud;

	private String nombre;

	private String telefono;

	private String ubicacion;
	
	//bi-directional many-to-one association to TaqueriaTipo
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="taq_tipo_id")
		private TaqueriaTipo taqueriaTipo;

	public Long getTaqId() {
		return taqId;
	}

	public void setTaqId(Long taqId) {
		this.taqId = taqId;
	}

	public BigDecimal getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(BigDecimal calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public BigDecimal getLatitud() {
		return latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public BigDecimal getLongitud() {
		return longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public TaqueriaTipo getTaqueriaTipo() {
		return this.taqueriaTipo;
	}

	public void setTaqueriaTipo(TaqueriaTipo taqueriaTipo) {
		this.taqueriaTipo = taqueriaTipo;
	}

}