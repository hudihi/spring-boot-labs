package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServices;

public class PropertyInjectionController {

    GreetingServices greetingServices;

    public String sayHi(){
        return greetingServices.sayHi();
    }
}
