package com.tacofy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tacofy.bo.TaqueriaTipoBO;
import com.tacofy.builder.TaqueriaTipoBuilder;
import com.tacofy.dao.TaqueriaTipoDAO;
import com.tacofy.service.TaqueriaTipoService;

@Service
public class TaqueriaTipoServiceImpl implements TaqueriaTipoService {
	
	@Autowired
	private TaqueriaTipoDAO dao;

	@Override
	public List<TaqueriaTipoBO> getTaqueriaTipos() {
		return TaqueriaTipoBuilder.buildListBO(dao.getTaqueriaTipos());
	}

	
	
}
