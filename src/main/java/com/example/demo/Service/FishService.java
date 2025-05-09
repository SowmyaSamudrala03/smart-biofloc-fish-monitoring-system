package com.example.demo.Service;

import com.example.demo.Entity.Fish;
import com.example.demo.Repo.FishRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FishService {
	@Autowired
	private FishRepo fishrepository;

	public Fish createFish(Fish fishname)
	{
		return fishrepository.save(fishname);

	}

	public Iterable<Fish> getallFish()
	{
		return fishrepository.findAll();
	}
}
