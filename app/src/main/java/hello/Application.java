package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s - Spring Boot",name);
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
