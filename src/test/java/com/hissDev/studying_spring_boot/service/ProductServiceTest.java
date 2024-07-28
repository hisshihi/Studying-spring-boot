package com.hissDev.studying_spring_boot.service;

import com.hissDev.studying_spring_boot.model.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    void getProducts() {

        // when
        List<Product> products = productService.getProducts();

        assertThat(products).isNotNull();
        assertThat(products).hasSize(2);

        assertThat(products.get(0).getName()).isEqualTo("iPhone");
        assertThat(products.get(0).getPrice()).isEqualTo(3000);

        assertThat(products.get(1).getName()).isEqualTo("Samsung");
        assertThat(products.get(1).getPrice()).isEqualTo(1000);

    }

    @Test
    @DirtiesContext
    void create() {

        Product product = new Product();
        product.setId(3L);
        product.setName("Dyson");
        product.setPrice(2700);

        productService.create(product);

        List<Product> products = productService.getProducts();

        assertThat(products).isNotNull();
        assertThat(products).hasSize(3);

        assertThat(products.get(2).getName()).isEqualTo("Dyson");
        assertThat(products.get(2).getPrice()).isEqualTo(2700);

    }
}