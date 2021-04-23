package edu.greenriver.sdev.sfgdi.controllers;

import edu.greenriver.sdev.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
