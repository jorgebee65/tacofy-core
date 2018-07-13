package com.tacofy.builder;

import java.util.ArrayList;
import java.util.List;

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
		TaqueriaTipoPO po = new TaqueriaTipoPO();
			po.setTaqTipoId(bo.getId());
			po.setDescripcion(bo.getDescripcion());
		return po;
	}
	
	public static List<TaqueriaTipoBO> buildListBO(List<TaqueriaTipoPO> lstPO){
		List<TaqueriaTipoBO> lstBO = new ArrayList<>();
			lstPO.forEach(po ->{
				lstBO.add(buildBO(po));
			});
		return lstBO;
	}
	
	public static List<TaqueriaTipoPO> buildListPO(List<TaqueriaTipoBO> lstBO){
		List<TaqueriaTipoPO> lstPO = new ArrayList<>();
			lstBO.forEach(bo ->{
				lstPO.add(buildPO(bo));
			});
		return lstPO;
	}
	
}
