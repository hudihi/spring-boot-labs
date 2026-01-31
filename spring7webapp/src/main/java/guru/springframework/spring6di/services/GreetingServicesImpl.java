package guru.springframework.spring6di.services;

public class GreetingServicesImpl implements GreetingServices {

    @Override
    public String sayHi(){
        System.out.println("I'm in Services Implementation Class");

        return "Hi, everyone!!!";
    }
}
