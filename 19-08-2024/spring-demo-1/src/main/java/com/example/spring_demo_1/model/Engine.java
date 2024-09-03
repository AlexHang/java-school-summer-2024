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
public class Engine {

    @Id
    @GeneratedValue
    private int id;
    private int capacity;
    private int power;

    @OneToOne
    private Car associatedCar;
}
