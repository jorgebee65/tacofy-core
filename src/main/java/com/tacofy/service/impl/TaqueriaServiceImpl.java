package com.tacofy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tacofy.dao.TaqueriaDAO;
import com.tacofy.po.Taqueria;
import com.tacofy.service.TaqueriaService;

public class TaqueriaServiceImpl implements TaqueriaService {
	
	@Autowired
	private TaqueriaDAO taqueriaDAO;

	@Override
	public List<Taqueria> getTaquerias() {
		return taqueriaDAO.getTaquerias();
	}
	
}
