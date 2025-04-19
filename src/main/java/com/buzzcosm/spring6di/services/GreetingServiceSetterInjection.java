package com.buzzcosm.spring6di.services;

import org.springframework.stereotype.Service;

@Service("settingGreetingBean")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hey I'm setting a Greeting!!!";
    }
}
