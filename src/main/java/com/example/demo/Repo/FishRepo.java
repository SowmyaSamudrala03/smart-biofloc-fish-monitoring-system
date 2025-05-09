package com.example.demo.Repo;

import com.example.demo.Entity.Fish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishRepo extends JpaRepository<Fish, Long> {

}