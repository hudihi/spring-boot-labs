package guru.springframework.spring6di.controller.i18n;

import guru.springframework.spring6di.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {

    final private GreetingServices greetingServices;


    public Myi18NController(@Qualifier("i18NService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHi(){
        return greetingServices.sayHi();
    }
}
