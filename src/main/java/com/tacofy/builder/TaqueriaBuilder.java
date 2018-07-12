package com.tacofy.builder;

import java.util.ArrayList;
import java.util.List;

import com.tacofy.bo.TaqueriaBO;
import com.tacofy.po.TaqueriaPO;

public class TaqueriaBuilder {

	public static TaqueriaBO buildBO(TaqueriaPO po ) {
		TaqueriaBO bo = new TaqueriaBO();
			bo.setId(po.getTaqId());
			bo.setNombre(po.getNombre());
			bo.setCalificacion(po.getCalificacion());
			bo.setFechaCreacion(po.getFechaCreacion());
			bo.setLatitud(po.getLatitud());
			bo.setLongitud(po.getLongitud());
			bo.setTelefono(po.getTelefono());
			bo.setUbicacion(po.getUbicacion());
			bo.setTipo(TaqueriaTipoBuilder.buildBO(po.getTaqueriaTipoPO()));
			bo.setAmenidades(AmenidadBuilder.buildListBO(po.getAmenidads()));
			bo.setTacos(TacoTipoBuilder.buildListBO(po.getTacoTipos()));
			bo.setFotos(FotoBuilder.buildListBO(po.getTaqueriaFotos()));
		return bo;
	}

	public static TaqueriaPO buildPO(TaqueriaBO bo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static List<TaqueriaBO> buildListBO(List<TaqueriaPO> lstPO){
		List<TaqueriaBO> lstBO = new ArrayList<>();
			lstPO.forEach(po ->{
				lstBO.add(buildBO(po));
			});
		return lstBO;
	}
	
}
