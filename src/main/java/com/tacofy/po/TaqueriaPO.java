package com.tacofy.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="taqueria")
public class TaqueriaPO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "taq_id")
	private Long taqId;

	private BigDecimal calificacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	private BigDecimal latitud;

	private BigDecimal longitud;

	private String nombre;

	private String telefono;

	private String ubicacion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taq_tipo_id")
	private TaqueriaTipoPO taqueriaTipoPO;

	@ManyToMany
	@JoinTable(name = "taqueria_amenidad", 
		joinColumns = { @JoinColumn(name = "taq_id") }, 
		inverseJoinColumns = {@JoinColumn(name = "amenidad_id") })
	private List<AmenidadPO> amenidads;
	
	@ManyToMany
	@JoinTable(
		name="taqueria_taco_tipo"
		, joinColumns={
			@JoinColumn(name="taq_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="taco_tipo_id")
			}
		)
	private List<TacoTipoPO> tacoTipos;
	
	@OneToMany
	@JoinColumn(name="taq_id")
	private List<TaqueriaFotoPO> taqueriaFotos;

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

	public TaqueriaTipoPO getTaqueriaTipoPO() {
		return this.taqueriaTipoPO;
	}

	public void setTaqueriaTipoPO(TaqueriaTipoPO taqueriaTipo) {
		this.taqueriaTipoPO = taqueriaTipo;
	}

	public List<AmenidadPO> getAmenidads() {
		return amenidads;
	}

	public void setAmenidads(List<AmenidadPO> amenidads) {
		this.amenidads = amenidads;
	}

	public List<TacoTipoPO> getTacoTipos() {
		return tacoTipos;
	}

	public void setTacoTipos(List<TacoTipoPO> tacoTipos) {
		this.tacoTipos = tacoTipos;
	}

	public List<TaqueriaFotoPO> getTaqueriaFotos() {
		return taqueriaFotos;
	}

	public void setTaqueriaFotos(List<TaqueriaFotoPO> taqueriaFotos) {
		this.taqueriaFotos = taqueriaFotos;
	}

}