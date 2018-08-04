package com.tacofy.builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.tacofy.bo.TaqueriaBO;
import com.tacofy.po.TaqueriaPO;
import com.tacofy.po.TaqueriaRedPO;

public class TaqueriaBuilder {

	public static TaqueriaBO buildBO(TaqueriaPO po) {
		TaqueriaBO bo = new TaqueriaBO();
		bo = buildSimpleBO(po);
		bo.setTipo(TaqueriaTipoBuilder.buildBO(po.getTaqueriaTipoPO()));
		bo.setAmenidades(AmenidadBuilder.buildListBO(po.getAmenidads()));
		bo.setTacos(TacoTipoBuilder.buildListBO(po.getTacoTipos()));
		//bo.setFotos(FotoBuilder.buildListBO(po.getTaqueriaFotos()));
		bo.setRedes(RedSocialBuilder.buildListBO(po.getRedes()));
		return bo;
	}

	public static TaqueriaPO buildPO(TaqueriaBO bo) {
		TaqueriaPO po = new TaqueriaPO();
		if (bo.getId() != null)
			po.setTaqId(bo.getId());
		po.setNombre(bo.getNombre());
		po.setFechaCreacion(new Date());
		po.setLatitud(bo.getLatitud());
		po.setLongitud(bo.getLongitud());
		po.setTelefono(bo.getTelefono());
		po.setUbicacion(bo.getUbicacion());
		po.setTaqueriaTipoPO(TaqueriaTipoBuilder.buildPO(bo.getTipo()));
		po.setAmenidads(AmenidadBuilder.buildListPO(bo.getAmenidades()));
		po.setTacoTipos(TacoTipoBuilder.buildListPO(bo.getTacos()));
		List<TaqueriaRedPO> redesPO = RedSocialBuilder.buildListPO(bo.getRedes());
		redesPO.forEach(red -> {
			red.setTaqueriaPO(po);
		});
		po.setRedes(redesPO);
		po.setImagen(bo.getImagen());
		return po;
	}

	public static List<TaqueriaBO> buildListBO(List<TaqueriaPO> lstPO) {
		List<TaqueriaBO> lstBO = new ArrayList<>();
		lstPO.forEach(po -> {
			lstBO.add(buildBO(po));
		});
		return lstBO;
	}

	public static TaqueriaBO buildSimpleBO(TaqueriaPO po) {
		TaqueriaBO bo = new TaqueriaBO();
		if (po.getTaqId() != null)
			bo.setId(po.getTaqId());
		bo.setNombre(po.getNombre());
		bo.setCalificacion(po.getCalificacion());
		bo.setFechaCreacion(po.getFechaCreacion());
		bo.setLatitud(po.getLatitud());
		bo.setLongitud(po.getLongitud());
		bo.setTelefono(po.getTelefono());
		bo.setUbicacion(po.getUbicacion());
		bo.setImagen(po.getImagen());
		return bo;
	}

}
