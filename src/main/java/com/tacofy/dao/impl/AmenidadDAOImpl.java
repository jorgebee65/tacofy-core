package com.tacofy.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tacofy.dao.AmenidadDAO;
import com.tacofy.po.AmenidadPO;

@Transactional
@Repository
public class AmenidadDAOImpl implements AmenidadDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	@Override
	public List<AmenidadPO> getAmenidadesPO() {
		String hql = "FROM AmenidadPO";
		return (List<AmenidadPO>) entityManager.createQuery(hql).getResultList();
	}
	
}
