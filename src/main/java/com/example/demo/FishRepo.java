package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishRepo extends CrudRepository<Fish, Long> {
	
}
