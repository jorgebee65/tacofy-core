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
	
	public static AmenidadPO buildPO(AmenidadBO bo) {
		AmenidadPO po = new AmenidadPO();
		po.setAmenidadId(bo.getId());
		po.setDescripcion(bo.getDescripcion());
		return po;
	}
	
	public static List<AmenidadPO> buildListPO(List<AmenidadBO> lstBO){
		List<AmenidadPO> lstPO = new ArrayList<>();
			lstBO.forEach(bo ->{
				lstPO.add(buildPO(bo));
			});
		return lstPO;
	}
}
