package com.tacofy.po;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the red_social database table.
 * 
 */
@Entity
@Table(name="red_social")
public class RedSocialPO implements Serializable {
	private static final long serialVersionUID = 1L;


	public RedSocialPO(int redSocId, String descripcion) {
		super();
		this.redSocId = redSocId;
		this.descripcion = descripcion;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="red_soc_id")
	private int redSocId;

	private String descripcion;
	
	@OneToMany(mappedBy = "redSocialPO")
	private List<TaqueriaRedPO> taquerias = new ArrayList<>();

	public RedSocialPO() {
	}

	public int getRedSocId() {
		return this.redSocId;
	}

	public void setRedSocId(int redSocId) {
		this.redSocId = redSocId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TaqueriaRedPO> getTaquerias() {
		return taquerias;
	}

	public void setTaquerias(List<TaqueriaRedPO> taquerias) {
		this.taquerias = taquerias;
	}

}