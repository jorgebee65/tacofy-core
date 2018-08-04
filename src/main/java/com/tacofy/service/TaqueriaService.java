package com.tacofy.service;

import java.util.List;

import com.tacofy.bo.TaqueriaBO;
import com.tacofy.exception.ServiceExceptionCO;

public interface TaqueriaService {
	
	List<TaqueriaBO> getTaquerias();
	TaqueriaBO save(TaqueriaBO bo);
	TaqueriaBO find(Long id) throws ServiceExceptionCO;
	TaqueriaBO update(TaqueriaBO bo);
}
