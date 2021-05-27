package com.example.springinjectionscenarios.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class VehicleService implements IVehicleService {
    public String getMessage() {
        return "Vehicle Service";
    }
}
