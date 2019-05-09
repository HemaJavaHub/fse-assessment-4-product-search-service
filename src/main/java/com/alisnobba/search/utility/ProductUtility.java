package com.alisnobba.search.utility;

import com.alisnobba.search.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductUtility {

    private static final Logger logger = LoggerFactory.getLogger(ProductUtility.class.getName());

    public static List<Product> filterByBrand(String targetBrand, List<Product> products) {

        List<Product> filteredProducts = products.stream()
                .filter(product -> targetBrand.equals(product.getBrand()))
                .collect(Collectors.toList());

        return filteredProducts;
    }

    public static List<Product> filterByColor(String targetColor, List<Product> products) {

        List<Product> filteredProducts = products.stream()
                .filter(product -> targetColor.equals(product.getColor()))
                .collect(Collectors.toList());

        return filteredProducts;

    }

    public static List<Product> filterByPriceRange(double upperLimit, double lowerLimit, List<Product> products) {

        List<Product> filteredProducts = products.stream()
                .filter(product -> (upperLimit > product.getPrice() && lowerLimit < product.getPrice()))
                .collect(Collectors.toList());

        return filteredProducts;

    }

}
