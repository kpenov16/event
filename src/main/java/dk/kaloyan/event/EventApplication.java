package dk.kaloyan.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EventApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EventApplication.class, args);
	}

}
