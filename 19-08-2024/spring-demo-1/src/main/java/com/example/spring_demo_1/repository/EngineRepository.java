package com.example.spring_demo_1.repository;

import com.example.spring_demo_1.model.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineRepository extends JpaRepository<Engine, Integer> {
}
