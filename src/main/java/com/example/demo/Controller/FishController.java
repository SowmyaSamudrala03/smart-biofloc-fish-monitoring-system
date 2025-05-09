package com.example.demo.Controller;

import com.example.demo.Entity.Fish;
import com.example.demo.Service.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Fish")
public class FishController {
	@Autowired
	private FishService fishService;


	@PostMapping("/create")
	public Fish create(@RequestBody Fish fish) {
		return fishService.createFish(fish);
	}
	
	@GetMapping("/all")
	public ResponseEntity<Long> findAllfish() {
		return (ResponseEntity<Long>) fishService.getallFish();
	}
}
