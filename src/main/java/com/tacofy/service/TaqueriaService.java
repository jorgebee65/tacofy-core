package com.tacofy.service;

import java.util.List;

import com.tacofy.bo.TaqueriaBO;
import com.tacofy.po.TaqueriaPO;

public interface TaqueriaService {
	
	List<TaqueriaBO> getTaquerias();
	TaqueriaBO save(TaqueriaBO bo);
	TaqueriaBO find(Long id);
}
