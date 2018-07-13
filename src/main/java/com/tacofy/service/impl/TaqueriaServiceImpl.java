package com.tacofy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tacofy.bo.TaqueriaBO;
import com.tacofy.builder.TaqueriaBuilder;
import com.tacofy.dao.TaqueriaDAO;
import com.tacofy.service.TaqueriaService;

@Service
public class TaqueriaServiceImpl implements TaqueriaService {
	
	@Autowired
	private TaqueriaDAO taqueriaDAO;

	@Override
	public List<TaqueriaBO> getTaquerias() {
		return TaqueriaBuilder.buildListBO(taqueriaDAO.buscar());
	}

	@Override
	public TaqueriaBO save(TaqueriaBO bo) {
		return taqueriaDAO.guardar(bo);
	}

	@Override
	public TaqueriaBO find(Long id) {
		return TaqueriaBuilder.buildBO(taqueriaDAO.buscar(id));
	}
	
}
