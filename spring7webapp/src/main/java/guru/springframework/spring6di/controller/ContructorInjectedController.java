package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServices;
import guru.springframework.spring6di.services.GreetingServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class ContructorInjectedController {


    private final GreetingServices greetingServices;

    public ContructorInjectedController(@Qualifier("propertyGreetingServiceBean") GreetingServices greetingServices){
        this.greetingServices = greetingServices;
    }

    public String sayHi(){
        return greetingServices.sayHi();
    }
}
