package com.fahrul.springjenkinsdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsDockerApplication {
	
	@GetMapping("/")
	public String ping() {
		return "Istimiwir kiwir kiwir";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDockerApplication.class, args);
	}

}
