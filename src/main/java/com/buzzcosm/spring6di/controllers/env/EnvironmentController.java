package com.buzzcosm.spring6di.controllers.env;

import com.buzzcosm.spring6di.services.env.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment(){
        return "You are in " + environmentService.getEnv() + " Environment";
    }
}
