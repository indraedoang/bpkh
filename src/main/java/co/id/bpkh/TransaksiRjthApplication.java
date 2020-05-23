package co.id.bpkh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class TransaksiRjthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransaksiRjthApplication.class, args);
	}

}
