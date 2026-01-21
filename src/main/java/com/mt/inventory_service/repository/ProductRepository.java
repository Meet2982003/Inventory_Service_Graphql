package com.mt.inventory_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mt.inventory_service.model.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(String category);
}
