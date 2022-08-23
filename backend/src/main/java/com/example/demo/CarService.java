package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public void buyACar1000() {
        Car car = new Car();
        double price = new Random().nextDouble(1000 - 900) + 900;
        car.setPrice(price);
        Gamer gamer = new Gamer();
        gamer.setMoney(gamer.getMoney() - price);
    }
}
