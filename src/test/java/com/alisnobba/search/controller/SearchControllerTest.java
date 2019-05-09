package com.alisnobba.search.controller;

import com.alisnobba.search.service.SearchService;
import com.alisnobba.search.utility.ProductUtility;
import com.alisnobba.search.model.Product;
import com.alisnobba.search.model.SearchParameter;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class SearchControllerTest {

    SearchService dummy;
    List<Product> expected;
    SearchParameter searchParameter;

    @Before
    public void setUp() throws Exception {

        dummy = Mockito.mock(SearchService.class);
        expected = ProductUtility.getProducts();
        searchParameter = SearchParameter.builder().withCategory("dresses").withBrand("gucci").withColor("yellow").withPriceRangeUpper(1000.0).withPriceRangeLower(0).build();

    }

    @Test
    public void search() {

        SearchController service = new SearchController(dummy);
        when(dummy.search(searchParameter)).thenReturn(expected);

        List<Product> actual = service.search(searchParameter);
        assertEquals(expected.size(), actual.size());

    }
}
