package com.example.spring_demo_1.controller;

import com.example.spring_demo_1.model.Car;
import com.example.spring_demo_1.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/test")
    public String getTestString() {
        return demoService.getHelloMessage();
    }

    @GetMapping("/create-car")
    public String saveNewCar(){
        demoService.saveNewCar();
        return "New car created";
    }

    @GetMapping("/view-cars")
    public List<Car> getAllCars(){
        return demoService.getAllCars();
    }
}