package com.example.spring_demo_1.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Car {
    @Id
    @GeneratedValue
    private int id;
    private String brand;
    private String carModel;
    private int price;

    @OneToOne
    private Engine engine;
}
