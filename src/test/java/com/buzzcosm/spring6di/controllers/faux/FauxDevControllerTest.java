package com.buzzcosm.spring6di.controllers.faux;

import com.buzzcosm.spring6di.services.faux.FauxDevGreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("DEV")
@SpringBootTest(classes = {FauxController.class, FauxDevGreetingService.class})
class FauxDevControllerTest {

    @Autowired
    private FauxController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}