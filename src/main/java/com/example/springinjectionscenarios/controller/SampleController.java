package com.example.springinjectionscenarios.controller;

import com.example.springinjectionscenarios.component.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleController {
    //  field is final, so that it can only be assigned within constructor or in place
    private final VehicleService vehicleService;

    //  This class will not instantiate without proper dependencies provided

    //  It is an error to declare multiple constructors while we are using
    //  automated DI system such as Spring. Spring may pick the overload that has
    //  least number of arguments. This may put the application is unpredictable
    //  condition. So, the recommendation is to have only one constructor that initializes
    //  all the dependencies. Also, make the dependencies final.
    //  Multiple dependencies can be declared in any order in the constructor.

    //  Here @Autowired is not required, but does no harm if present
    public SampleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public String get() {
        return vehicleService.getMessage();
    }
}
