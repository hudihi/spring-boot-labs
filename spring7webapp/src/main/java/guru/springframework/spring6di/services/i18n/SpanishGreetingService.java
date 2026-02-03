package guru.springframework.spring6di.services.i18n;


import guru.springframework.spring6di.services.GreetingServices;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingServices {
    @Override
    public String sayHi() {
        return "Hola Mundo - ES";
    }
}
