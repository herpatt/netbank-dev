package com.dhanjyothi.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhanjyothi.dao.FileDao;
import com.dhanjyothi.model.FileEntity;
import com.dhanjyothi.service.FileService;

@Transactional
@Service
public class FileServiceImpl implements FileService {
	@Autowired
	private FileDao fileDao;

	public void saveFileUpload(FileEntity fileEntity) {
		fileDao.saveFileUpload(fileEntity);
          
	}

	public List<FileEntity> viewAllFiles() {
		return fileDao.viewAllFiles();
		
	}

	public List<FileEntity> findByName(String fileName) {
		return fileDao.findByName(fileName);
	}

}
