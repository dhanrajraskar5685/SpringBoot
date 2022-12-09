package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.State;

@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate rt;

	@GetMapping(value = "/get")
	public Map<String, List<State>> getData() {
		Map<String, List<State>> map = rt.getForObject("http://localhost:9001/getData", Map.class);
		return map;

	}
}