package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Qualifier("propertyGreetingServiceBean")
    @Autowired
    GreetingServices greetingServices;

    public String sayHi(){
        return greetingServices.sayHi();
    }
}
