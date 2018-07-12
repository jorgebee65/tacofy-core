package com.tacofy.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tacofy.dao.TaqueriaTipoDAO;
import com.tacofy.po.TaqueriaTipoPO;

@Transactional
@Repository
public class TaqueriaTipoDAOImpl implements TaqueriaTipoDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	@Override
	public List<TaqueriaTipoPO> getTaqueriaTipos() {
		String hql = "FROM TaqueriaTipoPO";
		return (List<TaqueriaTipoPO>) entityManager.createQuery(hql).getResultList();
	}
	
}
