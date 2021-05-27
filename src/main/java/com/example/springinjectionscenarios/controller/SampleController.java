package com.example.springinjectionscenarios.controller;

import com.example.springinjectionscenarios.component.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleController {
    //  Field injection
    //  Don't use this
    //  The dependencies used this way, are opaque
    //  Thus, this class is not testable
    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public String get() {
        return vehicleService.getMessage();
    }
}
