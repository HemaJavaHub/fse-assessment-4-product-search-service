package com.alisnobba.search.service;

import com.alisnobba.search.model.Product;
import com.alisnobba.search.model.SearchParameter;
import com.alisnobba.search.repository.ProductRepository;
import com.alisnobba.search.utility.ProductUtility;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    private final ProductRepository productRepository;

    public SearchService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    /*
        This would not work well in a production environment - you would want to begin your search with a narrow subset of products, then filter from there.  An example would be getting all shirts, then filter down from there.  An alternative would be to use the Criteria API, Predicates or JPA Specifications which are all higher performance options available with JPA.

        See https://www.baeldung.com/spring-data-criteria-queries for more information on these APIs.
     */
    public List<Product> search(SearchParameter searchParameter) {

        List<Product> products = productRepository.findAll();

        if (activeSearch("brand", searchParameter)) {
            products = ProductUtility.filterByBrand(searchParameter.getBrand(), products);
        }

        if (activeSearch("color", searchParameter)) {
            products = ProductUtility.filterByColor(searchParameter.getColor(), products);
        }

        if (activeSearch("price", searchParameter)) {
            products = ProductUtility.filterByPriceRange(searchParameter.getPriceRangeUpper(), searchParameter.getPriceRangeLower(), products);
        }

        return products;
    }

    private boolean activeSearch(String value, SearchParameter searchParameter) {

        boolean valid = false;

        if ("brand".equals(value)) {

            valid = searchParameter.getBrand() != null && !searchParameter.getBrand().equals("");

        } else if ("color".equals(value)) {

            valid = searchParameter.getColor() != null && !searchParameter.getColor().equals("");

        } else if ("price".equals(value)) {

            valid = (searchParameter.getPriceRangeUpper() > 0.0) && (searchParameter.getPriceRangeUpper() > searchParameter.getPriceRangeLower()) && (searchParameter.getPriceRangeLower() >= 0.0);

        }

        return valid;

    }
}
