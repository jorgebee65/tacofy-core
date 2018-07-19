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

	
	@Id
    @ManyToOne
    @JoinColumn(name = "taq_id")
	private TaqueriaPO taqueriaPO;
	
	@Id
    @ManyToOne
    @JoinColumn(name = "red_soc_id")
	private RedSocialPO redSocialPO;

	@Column(name = "url")
	private String url;

	public TaqueriaPO getTaqueriaPO() {
		return taqueriaPO;
	}

	public void setTaqueriaPO(TaqueriaPO taqueriaPO) {
		this.taqueriaPO = taqueriaPO;
	}

	public RedSocialPO getRedSocialPO() {
		return redSocialPO;
	}

	public void setRedSocialPO(RedSocialPO redSocialPO) {
		this.redSocialPO = redSocialPO;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	

}