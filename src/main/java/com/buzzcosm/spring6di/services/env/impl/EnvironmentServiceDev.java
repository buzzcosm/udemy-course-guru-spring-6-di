package com.buzzcosm.spring6di.services.env.impl;

import com.buzzcosm.spring6di.services.env.EnvironmentService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnv() {
        return "dev";
    }
}
