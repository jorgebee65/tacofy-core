package com.tacofy.po;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the taqueria_red database table.
 * 
 */
@Embeddable
public class TaqueriaRedPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="taq_id", insertable=false, updatable=false)
	private int taqId;

	@Column(name="red_soc_id", insertable=false, updatable=false)
	private int redSocId;

	public TaqueriaRedPK() {
	}
	public int getTaqId() {
		return this.taqId;
	}
	public void setTaqId(int taqId) {
		this.taqId = taqId;
	}
	public int getRedSocId() {
		return this.redSocId;
	}
	public void setRedSocId(int redSocId) {
		this.redSocId = redSocId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TaqueriaRedPK)) {
			return false;
		}
		TaqueriaRedPK castOther = (TaqueriaRedPK)other;
		return 
			(this.taqId == castOther.taqId)
			&& (this.redSocId == castOther.redSocId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.taqId;
		hash = hash * prime + this.redSocId;
		
		return hash;
	}
}