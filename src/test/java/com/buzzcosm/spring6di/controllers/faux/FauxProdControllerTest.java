package com.buzzcosm.spring6di.controllers.faux;

import com.buzzcosm.spring6di.services.faux.FauxProdGreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("PROD")
@SpringBootTest(classes = {FauxController.class, FauxProdGreetingService.class})
class FauxProdControllerTest {

    @Autowired
    private FauxController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}