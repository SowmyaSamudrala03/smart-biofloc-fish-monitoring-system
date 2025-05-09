package com.example.demo.Repo;

import com.example.demo.Entity.Fish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishRepo extends CrudRepository<Fish, Long> {
	
}
