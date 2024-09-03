package com.example.bootcamp_app_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/employees")
public class DemoController {

    @DeleteMapping("test")
    public String getTestString() {
        return "Hello World";
    }
}
