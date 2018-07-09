package com.tacofy.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tacofy.dao.TaqueriaDAO;
import com.tacofy.po.Taqueria;

@Transactional
@Repository
public class TaqueriaDAOImpl implements TaqueriaDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	@Override
	public List<Taqueria> getTaquerias() {
		String hql = "FROM Taqueria";
		return (List<Taqueria>) entityManager.createQuery(hql).getResultList();
	}
	
}
