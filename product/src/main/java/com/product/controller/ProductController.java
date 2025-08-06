package com.product.controller;

import com.product.entity.Product;
import com.product.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @PostMapping("/save")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product)
    {
        return ResponseEntity.ok(productService.save(product));
    }

    @GetMapping("/findById/{productId}")
    public ResponseEntity <Optional<Product>>findById(@PathVariable int productId)
    {
        return ResponseEntity.ok(productService.findById(productId));

    }
}
