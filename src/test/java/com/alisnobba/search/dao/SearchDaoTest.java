package com.alisnobba.search.dao;

import com.alisnobba.search.model.Product;
import com.alisnobba.search.model.SearchParameter;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SearchDaoTest {

    SearchParameter searchParameter;

    @Before
    public void setUp() throws Exception {

        searchParameter = SearchParameter.builder().withCategory("dresses").withBrand("gucci").withColor("yellow").withPriceRangeUpper(3000).withPriceRangeLower(0).build();

    }

    @Test
    public void search() {

        SearchDao service = new SearchDao();
        List<Product> actual = service.search(searchParameter);
        assertEquals(1, actual.size());

    }
}
