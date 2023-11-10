package com.samster.springdiprofiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class MyUatService implements MyService{
    @Override
    public String doSomething() {
        return "Do something in UAT";
    }
}
