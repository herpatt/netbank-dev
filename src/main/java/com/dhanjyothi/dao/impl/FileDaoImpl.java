package com.dhanjyothi.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dhanjyothi.dao.FileDao;
import com.dhanjyothi.model.FileEntity;

@Repository
public class FileDaoImpl implements FileDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveFileUpload(FileEntity fileEntity) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(fileEntity);

	}

	public List<FileEntity> viewAllFiles() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM FileEntity";
		List<FileEntity> fe = (List) session.createQuery(hql);
		return fe;
	}

	public List<FileEntity> findByName(String fileName) {      
		Session session = sessionFactory.getCurrentSession();
		String hql = "FROM FileEntity f where f.fileName=:fileName";
		List<FileEntity> fe = (List) session.createQuery(hql).setParameter("fileName", fileName);
		return fe;
	}

}
