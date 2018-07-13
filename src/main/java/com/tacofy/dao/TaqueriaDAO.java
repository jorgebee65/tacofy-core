package com.tacofy.dao;

import java.util.List;

import com.tacofy.bo.TaqueriaBO;
import com.tacofy.po.TaqueriaPO;

public interface TaqueriaDAO {
	List<TaqueriaPO> buscar();
	TaqueriaBO guardar(TaqueriaBO taqueriaBO);
	TaqueriaPO buscar(Long id);
}
