package edu.greenriver.sdev.sfgdi.controllers;

import edu.greenriver.sdev.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructedInjectedControllerTest {

    ConstructedInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructedInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}