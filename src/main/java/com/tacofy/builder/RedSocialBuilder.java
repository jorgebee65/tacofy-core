package com.tacofy.builder;

import java.util.ArrayList;
import java.util.List;

import com.tacofy.bo.RedSocialBO;
import com.tacofy.co.RedSocial;
import com.tacofy.po.TaqueriaRedPO;

public class RedSocialBuilder {
	
	public static RedSocialBO buildBO(TaqueriaRedPO po) {
		RedSocialBO bo = new RedSocialBO();
		bo.setRedSocialCO(RedSocial.getById(po.getRedSocialPO().getRedSocId()));
		bo.setUrl(po.getUrl());
		return bo;
	}

	public static List<RedSocialBO> buildListBO(List<TaqueriaRedPO> lstPO){
		List<RedSocialBO> lstBO = new ArrayList<>();
			lstPO.forEach(po ->{
				lstBO.add(buildBO(po));
			});
		return lstBO;
	}
	
}
