package com.buzzcosm.spring6di.services.faux;

import com.buzzcosm.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service("fauxGreetingService")
public class FauxDevGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From Dev Environment!!!";
    }
}
