package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @BeforeEach
    void setUp() {
        propertyInjectionController = new PropertyInjectionController();
        propertyInjectionController.greetingServices = new GreetingServicesImpl();
    }

    @Test
    void sayHi() {
        System.out.println(propertyInjectionController.sayHi());
    }
}