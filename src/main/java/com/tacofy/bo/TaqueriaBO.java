package com.tacofy.bo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TaqueriaBO {
	private Long id;
	private BigDecimal calificacion;
	private Date fechaCreacion;
	private BigDecimal latitud;
	private BigDecimal longitud;
	private String nombre;
	private String telefono;
	private String ubicacion;
	private TaqueriaTipoBO tipo;
	private List<AmenidadBO> amenidades;
	private List<TacoTipoBO> tacos;
	private List<FotoBO> fotos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public TaqueriaTipoBO getTipo() {
		return tipo;
	}
	public void setTipo(TaqueriaTipoBO tipo) {
		this.tipo = tipo;
	}
	public List<AmenidadBO> getAmenidades() {
		return amenidades;
	}
	public void setAmenidades(List<AmenidadBO> amenidades) {
		this.amenidades = amenidades;
	}
	public List<TacoTipoBO> getTacos() {
		return tacos;
	}
	public void setTacos(List<TacoTipoBO> tacos) {
		this.tacos = tacos;
	}
	public List<FotoBO> getFotos() {
		return fotos;
	}
	public void setFotos(List<FotoBO> fotos) {
		this.fotos = fotos;
	}
}
