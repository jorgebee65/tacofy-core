package com.tacofy.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tacofy.bo.TaqueriaBO;
import com.tacofy.builder.TaqueriaBuilder;
import com.tacofy.dao.TaqueriaDAO;
import com.tacofy.exception.DatabaseExceptionCO;
import com.tacofy.po.TaqueriaPO;

@Transactional
@Repository
public class TaqueriaDAOImpl implements TaqueriaDAO {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	@SuppressWarnings("unchecked")
	@Override
	public List<TaqueriaPO> buscar() {
		String hql = "FROM TaqueriaPO";
		return (List<TaqueriaPO>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public TaqueriaBO guardar(TaqueriaBO taqueriaBO) {
		TaqueriaPO po = new TaqueriaPO();
		po = TaqueriaBuilder.buildPO(taqueriaBO);
		entityManager.persist(po);
		entityManager.flush();
		TaqueriaBO taqueria = TaqueriaBuilder.buildBO(po);
		return taqueria;
	}
	
	@Override
	public TaqueriaPO buscar(Long id) throws DatabaseExceptionCO {
		TaqueriaPO po = new TaqueriaPO();
		String hql = "FROM TaqueriaPO where taqId = :taqID";
		try {
		Query query = entityManager.createQuery(hql);
        query.setParameter("taqID", id);
        po = (TaqueriaPO)query.getSingleResult();
		}catch(NoResultException sre) {
			throw new DatabaseExceptionCO("TaqueriaId "+id+" not founded");
		}
		return po;
	}
	
}
