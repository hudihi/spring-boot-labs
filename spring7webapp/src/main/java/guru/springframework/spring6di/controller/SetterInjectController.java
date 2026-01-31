package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServices;

public class SetterInjectController {

    GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHi(){
        return greetingServices.sayHi();
    }
}
