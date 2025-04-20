package com.buzzcosm.spring6di.controllers.faux;

import com.buzzcosm.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final GreetingService greetingService;

    public FauxController(@Qualifier("fauxGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
