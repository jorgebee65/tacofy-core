package com.tacofy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tacofy.bo.AmenidadBO;
import com.tacofy.bo.TaqueriaTipoBO;
import com.tacofy.builder.AmenidadBuilder;
import com.tacofy.builder.TaqueriaTipoBuilder;
import com.tacofy.dao.AmenidadDAO;
import com.tacofy.dao.TaqueriaTipoDAO;
import com.tacofy.service.AmenidadService;
import com.tacofy.service.TaqueriaTipoService;

@Service
public class AmenidadServiceImpl implements AmenidadService {
	
	@Autowired
	private AmenidadDAO dao;

	@Override
	public List<AmenidadBO> getAmenidadesBO() {
		return AmenidadBuilder.buildListBO(dao.getAmenidadesPO());
	}

	
	
}
