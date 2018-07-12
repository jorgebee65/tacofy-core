package com.tacofy.builder;

import java.util.ArrayList;
import java.util.List;

import com.tacofy.bo.AmenidadBO;
import com.tacofy.po.AmenidadPO;

public class AmenidadBuilder {
	
	public static AmenidadBO buildBO(AmenidadPO po) {
		AmenidadBO bo = new AmenidadBO();
		bo.setId(po.getAmenidadId());
		bo.setDescripcion(po.getDescripcion());
		return bo;
	}
	
	public static List<AmenidadBO> buildListBO(List<AmenidadPO> lstPO){
		List<AmenidadBO> lstBO = new ArrayList<>();
			lstPO.forEach(po ->{
				lstBO.add(buildBO(po));
			});
		return lstBO;
	}
	
}
