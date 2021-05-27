package com.example.springinjectionscenarios.controller;

import com.example.springinjectionscenarios.component.IVehicleService;
import com.example.springinjectionscenarios.component.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleController {
    //  dependency is an interface now
    //  This is much better than a concrete dependency
    private final IVehicleService vehicleService;

    public SampleController(IVehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public String get() {
        return vehicleService.getMessage();
    }
}
