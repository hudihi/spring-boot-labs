package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServices;
import guru.springframework.spring6di.services.GreetingServicesImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    private final GreetingServices greetingServices;

    public MyControllerTest(){
        this.greetingServices = new GreetingServicesImpl();
    }

    @Test
    public void sayHi(){
        System.out.println(greetingServices.sayHi());
    }

}