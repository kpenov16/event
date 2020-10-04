package dk.kaloyan.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class EventApplicationTests {
	@Autowired private PasswordEncoder encoder;

	@Test
	void contextLoads() {
		System.out.println(encoder.encode("pass"));
	}

}
