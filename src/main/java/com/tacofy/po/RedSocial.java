package com.tacofy.po;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the red_social database table.
 * 
 */
@Entity
@Table(name="red_social")
public class RedSocial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="red_soc_id")
	private int redSocId;

	private String descripcion;

	public RedSocial() {
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

}