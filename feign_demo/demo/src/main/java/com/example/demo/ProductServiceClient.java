package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "product-service", url = "http://localhost:8081")
public interface ProductServiceClient {

 @RequestMapping(value = "/products", method = RequestMethod.GET)
 public List < ? > getProducts();

 @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
 public ResponseEntity<?> getProduct(@PathVariable("id") int productId);

}