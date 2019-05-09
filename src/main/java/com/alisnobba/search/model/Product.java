package com.alisnobba.search.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String category;
    private String brand;
    private String color;
    private double price;

    public Product() {
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(category, product.category) &&
                Objects.equals(brand, product.brand) &&
                Objects.equals(color, product.color);
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public static final class ProductBuilder {
        private String category;
        private String brand;
        private String color;
        private double price;

        private ProductBuilder() {
        }

        public ProductBuilder withCategory(String category) {
            this.category = category;
            return this;
        }

        public ProductBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public ProductBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public ProductBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.color = this.color;
            product.category = this.category;
            product.price = this.price;
            product.brand = this.brand;
            return product;
        }
    }
}
