package com.alisnobba.search.repository;

import com.alisnobba.search.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
