package com.mt.inventory_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mt.inventory_service.model.Product;
import com.mt.inventory_service.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    // update existing stock
    public Product updateStock(long id, int stock) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("product not found with id" + id));
        existingProduct.setStock(stock);
        return productRepository.save(existingProduct);
    }

    // recieved new stock in shipment then only add in existing
    public Product addInExistingStock(long id, int quantity) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("product not found with id" + id));
        existingProduct.setStock(existingProduct.getStock() + quantity);
        return productRepository.save(existingProduct);
    }

}
