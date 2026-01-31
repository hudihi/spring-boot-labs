package guru.springframework.spring6di.controller;

import guru.springframework.spring6di.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContructorInjectedControllerTest {

    ContructorInjectedController contructorInjectedController;

    @BeforeEach
    void setUp() {
        contructorInjectedController = new ContructorInjectedController(new GreetingServicesImpl());
    }

    @Test
    void sayHi() {
        System.out.println(contructorInjectedController.sayHi());
    }
}