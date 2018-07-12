package com.tacofy.builder;

import com.tacofy.bo.TaqueriaTipoBO;
import com.tacofy.po.TaqueriaTipoPO;

public class TaqueriaTipoBuilder {

	public static TaqueriaTipoBO buildBO(TaqueriaTipoPO po) {
		TaqueriaTipoBO bo = new TaqueriaTipoBO();
		bo.setId(po.getTaqTipoId());
		bo.setDescripcion(po.getDescripcion());
		return bo;
	}

	public static TaqueriaTipoPO buildPO(TaqueriaTipoBO bo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
