package com.alisnobba.search.utility;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductUtilityTest {

    @Test
    public void getProducts() {
        assertEquals(9, ProductUtility.getProducts().size());
    }

    @Test
    public void searchByBrand() {

        assertEquals(2, ProductUtility.filterByBrand("gucci", ProductUtility.getProducts()).size());
        assertEquals(2, ProductUtility.filterByBrand("marni", ProductUtility.getProducts()).size());
    }

    @Test
    public void searchByColor() {

        assertEquals(1, ProductUtility.filterByColor("yellow", ProductUtility.getProducts()).size());
        assertEquals(2, ProductUtility.filterByColor("black", ProductUtility.getProducts()).size());

    }

    @Test
    public void searchByPriceRange() {

        assertEquals(3, ProductUtility.filterByPriceRange(1000.0, 0.0, ProductUtility.getProducts()).size());
        assertEquals(2, ProductUtility.filterByPriceRange(3000.0, 2000.0, ProductUtility.getProducts()).size());

    }
}
