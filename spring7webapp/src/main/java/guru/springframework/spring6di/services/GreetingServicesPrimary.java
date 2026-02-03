package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service("greetingServicePrimaryBean")
public class GreetingServicesPrimary implements GreetingServices{
    @Override
    public String sayHi() {
        return "Greetings from Primary Controller";
    }
}
