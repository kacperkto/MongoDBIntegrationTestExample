package com.example.demo3;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    ProductRepository productRepository;
    public ProductController(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @GetMapping(value ="/{id}")
    public Optional<Product> getProductByID(@PathVariable("id") String id){
        return productRepository.findById(id);
    }


    @GetMapping("/hello")
    public List<Product> gethello(){
        return productRepository.findAll();
    }

}