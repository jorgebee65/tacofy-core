package com.tacofy.builder;

import java.util.ArrayList;
import java.util.List;

import com.tacofy.bo.FotoBO;
import com.tacofy.po.TaqueriaFotoPO;

public class FotoBuilder {
	
	public static FotoBO buildBO(TaqueriaFotoPO po) {
		FotoBO bo = new FotoBO();
		bo.setId(po.getTaqFotoId());
		bo.setDescripcion(po.getRuta());
		return bo;
	}
	
	public static List<FotoBO> buildListBO(List<TaqueriaFotoPO> lstPO){
		List<FotoBO> lstBO = new ArrayList<>();
		if(lstPO!=null) {
			lstPO.forEach(po ->{
				lstBO.add(buildBO(po));
			});
		}
		return lstBO;
	}
}
