package com.samster.springdiprofiles.controllers;

import com.samster.springdiprofiles.services.MyService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    public String doIt(){
        return myService.doSomething();
    }
}
