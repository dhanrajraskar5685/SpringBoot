package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FileData;
import com.example.demo.repo.FileRepositry;


@Service
public class FileServiceImpl implements FileService{

	
	@Autowired
	private FileRepositry fr;
	
	@Override
	public void addfile(FileData fileData) {
		// TODO Auto-generated method stub
		fr.save(fileData);
	}

}
