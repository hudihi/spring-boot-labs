package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServices;
import guru.springframework.spring6di.services.GreetingServicesImpl;

public class ContructorInjectedController {
    private final GreetingServices greetingServices;

    public ContructorInjectedController(GreetingServicesImpl greetingServices){
        this.greetingServices = greetingServices;
    }

    public String sayHi(){
        return greetingServices.sayHi();
    }
}
