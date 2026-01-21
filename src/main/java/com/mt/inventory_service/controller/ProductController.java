package com.mt.inventory_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.mt.inventory_service.model.Product;
import com.mt.inventory_service.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @QueryMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @QueryMapping
    public List<Product> getProductsByCategory(@Argument String category) {
        return productService.getProductsByCategory(category);
    }

    @MutationMapping
    public Product updateStock(@Argument long id, @Argument int stock) {
        return productService.updateStock(id, stock);
    }

    @MutationMapping
    public Product additionInStock(@Argument long id, @Argument int quantity) {
        return productService.addInExistingStock(id, quantity);
    }
}
