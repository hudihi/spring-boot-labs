package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring7webappApplication {

	public static void main(String[] args) {
		ApplicationContext cxt = SpringApplication.run(Spring7webappApplication.class, args);

		MyController controller = cxt.getBean(MyController.class);

		System.out.println(controller.sayHi());
	}

}
