package com.example.onlinepayments;

import com.example.onlinepayments.client.PaySafeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlinePaymentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePaymentsApplication.class, args);
	}

}
