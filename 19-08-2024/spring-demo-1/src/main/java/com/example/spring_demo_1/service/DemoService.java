package com.example.spring_demo_1.service;

import com.example.spring_demo_1.model.Car;
import com.example.spring_demo_1.model.Engine;
import com.example.spring_demo_1.repository.CarRepository;
import com.example.spring_demo_1.repository.EngineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    CarRepository carRepository;

    @Autowired
    EngineRepository engineRepository;

    public String getHelloMessage(){
        return "Hello World";
    }

    public void saveNewCar(){
        Car c1 = new Car();
        c1.setCarModel("aaaa");
        c1.setPrice(25000);

        Engine e1 = new Engine();
        e1.setCapacity(2000);
        e1.setPower(180);
        engineRepository.save(e1);
        c1.setEngine(e1);
        carRepository.save(c1);
    }

    public List<Car> getAllCars(){
        return carRepository.findAll();
    }
}
