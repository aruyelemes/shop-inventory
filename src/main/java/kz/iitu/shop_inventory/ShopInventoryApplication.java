package kz.iitu.shop_inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class ShopInventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopInventoryApplication.class, args);
	}

}
