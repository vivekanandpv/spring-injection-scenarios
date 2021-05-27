package com.example.springinjectionscenarios.component;

import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    public String getMessage() {
        return "Vehicle Service";
    }
}
