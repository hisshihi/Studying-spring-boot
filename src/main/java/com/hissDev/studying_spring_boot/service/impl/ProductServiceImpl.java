package com.hissDev.studying_spring_boot.service.impl;

import com.hissDev.studying_spring_boot.model.entity.Product;
import com.hissDev.studying_spring_boot.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    List<Product> products = new ArrayList<>(List.of(
            new Product(1L, "iPhone", 3000),
            new Product(2L, "Samsung", 1000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

}
