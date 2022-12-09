package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.FileData;
import com.example.demo.service.FileService;

@RestController
public class FileController {

	@Autowired
	private FileService fs;

	@PostMapping(value = "/addFile")
	public String fileDataToStore(@RequestPart MultipartFile file, @RequestPart String fname) throws IOException {
		System.out.println(file.getOriginalFilename() + "  " + fname);
		FileData fd = new FileData();
		fd.setFname(file.getOriginalFilename());
		fd.setFdata(file.getBytes());
		fs.addfile(fd);
		return "Data Stored";
	}

}