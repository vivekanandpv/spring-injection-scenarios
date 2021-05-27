package com.example.springinjectionscenarios.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//  also possible: @Configuration, @Repository
//  Because, all these are applied over @Component
//  It is recommended to use them for their specialized purpose
//  because, the concerns they deal with are different and in future
//  they may get additional functionalities
@Service
public class VehicleService {
    public String getMessage() {
        return "Vehicle Service";
    }
}
