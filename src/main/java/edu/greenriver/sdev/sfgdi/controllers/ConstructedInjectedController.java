package edu.greenriver.sdev.sfgdi.controllers;

import edu.greenriver.sdev.sfgdi.services.GreetingService;

public class ConstructedInjectedController {

    private final GreetingService greetingService;

    public ConstructedInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
