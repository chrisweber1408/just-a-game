package com.example.demo.user;

import com.example.demo.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gamer {

    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String password;
    private List<String> roles;
    private List<Car> listOfCars;
    private double money = 10000;
}



