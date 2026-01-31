package guru.springframework.spring6di.controller;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHi(){
        System.out.println("I'm In Controller");

        return "Hello everyone there!!!";
    }
}
