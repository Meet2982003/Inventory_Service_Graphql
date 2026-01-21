package com.mt.inventory_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryServiceApplication {

	// @Autowired
	// private ProductRepository repository;

	// @PostConstruct
	// public void initDB() {
	// List<Product> products = Stream.of(
	// new Product("Wireless Mouse", "Electronics", 29.99f, 150),
	// new Product("Coffee Mug", "Kitchen", 12.50f, 85),
	// new Product("Running Shoes", "Sports", 79.99f, 42),
	// new Product("Desk Lamp", "Furniture", 45.00f, 30),
	// new Product("Notebook Set", "Stationery", 8.75f,
	// 200))
	// .collect(Collectors.toList());

	// repository.saveAll(products);
	// }

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

}
