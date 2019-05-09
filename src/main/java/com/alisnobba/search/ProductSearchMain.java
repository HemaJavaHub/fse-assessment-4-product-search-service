package com.alisnobba.search;

import com.alisnobba.search.model.Product;
import com.alisnobba.search.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductSearchMain {

    public static void main(String[] args) {
        SpringApplication.run(ProductSearchMain.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {

        return args -> {

            // adding test data
            productService.save(Product.builder().withCategory("dresses").withBrand("gucci").withColor("yellow").withPrice(2272.0).build());
            productService.save(Product.builder().withCategory("dresses").withBrand("gucci").withColor("red").withPrice(1966.0).build());
            productService.save(Product.builder().withCategory("dresses").withBrand("marni").withColor("brown").withPrice(999.0).build());
            productService.save(Product.builder().withCategory("dresses").withBrand("marni").withColor("pink").withPrice(1129.0).build());
            productService.save(Product.builder().withCategory("dresses").withBrand("bottega veneta").withColor("black").withPrice(2200.0).build());
            productService.save(Product.builder().withCategory("dresses").withBrand("prada").withColor("black").withPrice(1650.0).build());
            productService.save(Product.builder().withCategory("dresses").withBrand("victoria beckham").withColor("blue").withPrice(927.0).build());
            productService.save(Product.builder().withCategory("dresses").withBrand("celine").withColor("beige").withPrice(1901.0).build());
            productService.save(Product.builder().withCategory("dresses").withBrand("jil sander").withColor("orange").withPrice(511.0).build());
            

        };
    }

}
