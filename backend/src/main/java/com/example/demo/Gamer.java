package com.example.demo;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;


@Data
public class Gamer {

    @Id
    private String id;
    private String name;
    private List<Car> listOfCars;
    private double money = 10000;

}
