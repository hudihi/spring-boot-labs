package guru.springframework.spring6di.controller.i18n;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles("ES")
@SpringBootTest
public class Myi8NControllerTestEN {

    @Autowired
    Myi18NController myi18NController;

    @Test
    public void sayHi(){
        System.out.println(myi18NController.sayHi());
    }
}
