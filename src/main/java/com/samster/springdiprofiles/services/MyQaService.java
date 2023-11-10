package com.samster.springdiprofiles.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class MyQaService implements MyService{
    @Override
    public String doSomething() {
        return "Do something in QA";
    }
}
