package com.alisnobba.search.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Product product;

    @Before
    public void setUp() throws Exception {
        product = Product.builder().withCategory("dresses").withBrand("gucci").withColor("yellow").withPrice(2270.0).build();
    }

    @Test
    public void getCategory() {

        assertEquals("dresses", product.getCategory());

    }

    @Test
    public void getBrand() {

        assertEquals("gucci", product.getBrand());

    }

    @Test
    public void getColor() {

        assertEquals("yellow", product.getColor());
    }

    @Test
    public void getPrice() {

        assertEquals(2270.0, product.getPrice(), 0.0000001);

    }

    @Test
    public void builder() {

        assertEquals(product, Product.builder()
                .withCategory("dresses")
                .withBrand("gucci")
                .withColor("yellow")
                .withPrice(2270.0)
                .build());

    }
}
