package com.buzzcosm.spring6di.services.faux;

import com.buzzcosm.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service("fauxGreetingService")
public class FauxQaGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello From QA Environment!!!";
    }
}
