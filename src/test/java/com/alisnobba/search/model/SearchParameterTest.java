package com.alisnobba.search.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchParameterTest {

    SearchParameter searchParameter;

    @Before
    public void setUp() throws Exception {

        searchParameter = SearchParameter.builder().withCategory("dresses").withBrand("gucci").withColor("yellow").withPriceRangeUpper(1000.0).withPriceRangeLower(0).build();

    }


    @Test
    public void category() {

        searchParameter.setCategory("boots");
        assertEquals("boots", searchParameter.getCategory());

    }

    @Test
    public void brand() {

        searchParameter.setBrand("marni");
        assertEquals("marni", searchParameter.getBrand());

    }



    @Test
    public void color() {

        searchParameter.setColor("black");
        assertEquals("black", searchParameter.getColor());

    }



    @Test
    public void priceRangeUpper() {

        searchParameter.setPriceRangeUpper(100.0);
        assertEquals(100.0, searchParameter.getPriceRangeUpper(), 0.0000001);

    }



    @Test
    public void priceRangeLower() {

        searchParameter.setPriceRangeLower(10.0);
        assertEquals(10.0, searchParameter.getPriceRangeLower(), 0.0000001);

    }



    @Test
    public void testToString() {

        assertNotNull(searchParameter.toString());
    }
}
