package com.samster.springdiprofiles.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class MyProdService implements MyService {

    @Override
    public String doSomething() {
        return "Do something in Prod";
    }
}
