package com.example.springinjectionscenarios.controller;

import com.example.springinjectionscenarios.component.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleController {
    //  Dependency as a field, but exposes a setter
    private VehicleService vehicleService;

    //  Setter injection
    //  Still, the developer has to remember to set the field
    //  But the class itself is more transparent
    //  There is still a risk of initializing the class without proper
    //  dependencies, particularly in unit testing
    @Autowired  //  autowired is required as of this version
    public void setVehicleService(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public String get() {
        return vehicleService.getMessage();
    }
}
