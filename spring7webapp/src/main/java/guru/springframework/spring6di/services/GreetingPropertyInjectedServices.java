package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingServiceBean")
public class GreetingPropertyInjectedServices implements GreetingServices {
    @Override
    public String sayHi() {
        return "Friends don't let friends to property injection!!!";
    }
}
