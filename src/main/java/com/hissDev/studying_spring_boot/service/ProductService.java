package com.hissDev.studying_spring_boot.service;

import com.hissDev.studying_spring_boot.model.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    void create(Product product);
}
