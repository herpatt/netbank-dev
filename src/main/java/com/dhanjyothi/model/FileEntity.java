package com.dhanjyothi.model;

import java.util.Arrays;


public class FileEntity {

    private long id;
    private String fileName;
    private byte[] date;
  
  
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public byte[] getDate() {
	return date;
}
public void setDate(byte[] date) {
	this.date = date;
}
@Override
public String toString() {
	return "FileEntity [id=" + id + ", fileName=" + fileName + ", date=" + Arrays.toString(date) + "]";
}
  
  
}

