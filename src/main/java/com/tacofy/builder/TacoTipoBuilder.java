package com.tacofy.builder;

import java.util.ArrayList;
import java.util.List;

import com.tacofy.bo.TacoTipoBO;
import com.tacofy.po.TacoTipoPO;

public class TacoTipoBuilder {
	
	public static TacoTipoBO buildBO(TacoTipoPO po) {
		TacoTipoBO bo = new TacoTipoBO();
			bo.setId(po.getTacoTipoId());
			bo.setDescripcion(po.getDescripcion());
		return bo;
	}
	
	public static List<TacoTipoBO> buildListBO(List<TacoTipoPO> lstPO){
		List<TacoTipoBO> lstBO = new ArrayList<>();
			lstPO.forEach(po ->{
				lstBO.add(buildBO(po));
			});
		return lstBO;
	}
	
	public static TacoTipoPO buildPO(TacoTipoBO bo) {
		TacoTipoPO po = new TacoTipoPO();
			po.setTacoTipoId(bo.getId());
			po.setDescripcion(bo.getDescripcion());
		return po;
	}
	
	public static List<TacoTipoPO> buildListPO(List<TacoTipoBO> lstPO){
		List<TacoTipoPO> lstBO = new ArrayList<>();
			lstPO.forEach(bo ->{
				lstBO.add(buildPO(bo));
			});
		return lstBO;
	}
}
