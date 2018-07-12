package com.tacofy.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tacofy.dao.TaqueriaDAO;
import com.tacofy.po.TaqueriaPO;

@Transactional
@Repository
public class TaqueriaDAOImpl implements TaqueriaDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	@Override
	public List<TaqueriaPO> getTaquerias() {
		String hql = "FROM TaqueriaPO";
		return (List<TaqueriaPO>) entityManager.createQuery(hql).getResultList();
	}
	
}
