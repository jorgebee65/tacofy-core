package com.tacofy.po;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the taqueria_red database table.
 * 
 */
@Entity
@Table(name="taqueria_red")
public class TaqueriaRedPO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TaqueriaRedPK id;

	private String url;

	public TaqueriaRedPO() {
	}

	public TaqueriaRedPK getId() {
		return this.id;
	}

	public void setId(TaqueriaRedPK id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}