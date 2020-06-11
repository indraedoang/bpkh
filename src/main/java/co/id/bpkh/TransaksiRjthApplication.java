package co.id.bpkh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients("co.id.bpkh.proxy")
//@EnableDiscoveryClient
public class TransaksiRjthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransaksiRjthApplication.class, args);
	}
	
	
}
