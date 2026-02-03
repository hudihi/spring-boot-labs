package guru.springframework.spring6di.controller.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles
@SpringBootTest
class Myi18NControllerTestES {

    @Autowired
    Myi18NController myi18NController;



    @Test
    void sayHi() {
        System.out.println(myi18NController.sayHi());
    }
}