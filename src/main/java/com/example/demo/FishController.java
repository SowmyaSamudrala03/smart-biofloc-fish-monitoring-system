package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FishController {
	@Autowired
	private FishService fishserv;
	
	@PostMapping("/create")
	public Fish create(@RequestBody Fish fishname) {
		return fishserv.createFish(fishname);
	}
	
	@GetMapping("/all")
	public Iterable<Fish> findAllfish() {
		return fishserv.getallFish();
	}
}
