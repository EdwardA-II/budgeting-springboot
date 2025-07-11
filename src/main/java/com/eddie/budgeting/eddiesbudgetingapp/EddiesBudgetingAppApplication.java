package com.eddie.budgeting.eddiesbudgetingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EddiesBudgetingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EddiesBudgetingAppApplication.class, args);
	}

	@RestController
	@RequestMapping("/api/test")
	public class TestController {

		@GetMapping
		public String hello() {
            return "Wassup my boy!";
		}
	}

	@RestController
	@RequestMapping("/api/test/num")
	public class TestConnectA {

		@GetMapping
		public int getNumber() {
			return 5;
		}
	}

}
