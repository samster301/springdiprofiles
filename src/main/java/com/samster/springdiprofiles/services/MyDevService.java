package com.samster.springdiprofiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"dev","default"})
@Service
public class MyDevService implements MyService{

    @Override
    public String doSomething() {
        return "Do Something in Dev";
    }
}
