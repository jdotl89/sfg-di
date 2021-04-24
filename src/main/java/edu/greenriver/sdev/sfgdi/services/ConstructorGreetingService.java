package edu.greenriver.sdev.sfgdi.services;

import edu.greenriver.sdev.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
