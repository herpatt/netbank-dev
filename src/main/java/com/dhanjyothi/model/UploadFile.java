package com.dhanjyothi.model;


import org.springframework.web.multipart.MultipartFile;

public class UploadFile {

	private MultipartFile file;
	

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "UploadFile [file=" + file + "]";
	}
	
	
	
}