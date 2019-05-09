package com.alisnobba.search.controller;

import com.alisnobba.search.model.Product;
import com.alisnobba.search.model.SearchParameter;
import com.alisnobba.search.service.SearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {

    private static final Logger logger = LoggerFactory.getLogger(SearchController.class);

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    /*
    Example JSON:

    {
        "color":"black",
        "category":"dresses",
        "brand":"bottega veneta",
        "priceRangeUpper":"2500",
        "priceRangeLower":"2000"
    }

    Returns one record:
    [
        {
            "category": "dresses",
            "brand": "bottega veneta",
            "color": "black",
            "price": 2200
        }
    ]

    To return all products, submit empty JSON string:

    {
    }

     */
    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public List<Product> search(@RequestBody SearchParameter searchParameter) {

        logger.info("Search initiated for: " + searchParameter);
        List<Product> products = searchService.search(searchParameter);

        return products;
    }


}
