package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.State;

@RestController
public class countryController {

	@GetMapping(value = "/getData")
	public Map<String, List<State>> getData() {
		Map<String, List<State>> map = new HashMap<String, List<State>>();

		List<State> slist = new ArrayList<State>();

		State state = new State();
		state.setSid(1);
		state.setSname("Maharashtra");
		State state1 = new State();
		state1.setSid(2);
		state1.setSname("Karnatka");

		slist.add(state);
		slist.add(state1);
		map.put("mh", slist);

		return map;

	}

}
