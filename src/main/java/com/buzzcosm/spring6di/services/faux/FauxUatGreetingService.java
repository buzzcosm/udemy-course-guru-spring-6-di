package com.buzzcosm.spring6di.services.faux;

import com.buzzcosm.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("fauxGreetingService")
public class FauxUatGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From UAT Environment!!!";
    }
}
