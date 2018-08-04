package com.tacofy.builder;

import java.util.ArrayList;
import java.util.List;

import com.tacofy.bo.RedSocialBO;
import com.tacofy.co.RedSocial;
import com.tacofy.po.RedSocialPO;
import com.tacofy.po.TaqueriaRedPO;

public class RedSocialBuilder {
	
	public static RedSocialBO buildBO(TaqueriaRedPO po) {
		RedSocialBO bo = new RedSocialBO();
		bo.setRedSocialCO(RedSocial.getById(po.getRedSocialPO().getRedSocId()));
		bo.setUrl(po.getUrl());
		return bo;
	}

	public static TaqueriaRedPO buildPO(RedSocialBO bo) {
		TaqueriaRedPO po = new TaqueriaRedPO();
		po.setRedSocialPO(new RedSocialPO(bo.getRedSocialCO().getValue(), bo.getRedSocialCO().name()));
		po.setUrl(bo.getUrl());
		return po;
	}
	
	public static List<RedSocialBO> buildListBO(List<TaqueriaRedPO> lstPO){
		List<RedSocialBO> lstBO = new ArrayList<>();
			lstPO.forEach(po ->{
				lstBO.add(buildBO(po));
			});
		return lstBO;
	}
	
	public static List<TaqueriaRedPO> buildListPO(List<RedSocialBO> lstBO){
		List<TaqueriaRedPO> lstPO = new ArrayList<>();
		lstBO.forEach(bo ->{
			lstPO.add(buildPO(bo));
			});
		return lstPO;
	}
	
}
