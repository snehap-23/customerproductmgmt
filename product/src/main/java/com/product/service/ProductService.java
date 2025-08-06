package com.product.service;

import com.product.entity.Product;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
 public interface ProductService {
    Product save(Product product);
    Optional<Product> findById(int productId);
}
