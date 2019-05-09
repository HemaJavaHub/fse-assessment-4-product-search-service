package com.alisnobba.search.model;


public class SearchParameter {

    private String category;
    private String brand;
    private String color;
    private double priceRangeUpper;
    private double priceRangeLower;

    public SearchParameter() {
    }

    public static SearchParameterBuilder builder() {
        return new SearchParameterBuilder();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPriceRangeUpper() {
        return priceRangeUpper;
    }

    public void setPriceRangeUpper(double priceRangeUpper) {
        this.priceRangeUpper = priceRangeUpper;
    }

    public double getPriceRangeLower() {
        return priceRangeLower;
    }

    public void setPriceRangeLower(double priceRangeLower) {
        this.priceRangeLower = priceRangeLower;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchParameter{");
        sb.append("category='").append(category).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", priceRangeUpper=").append(priceRangeUpper);
        sb.append(", priceRangeLower=").append(priceRangeLower);
        sb.append('}');
        return sb.toString();
    }

    public static final class SearchParameterBuilder {
        private String category;
        private String brand;
        private String color;
        private double priceRangeUpper;
        private double priceRangeLower;

        private SearchParameterBuilder() {
        }

        public SearchParameterBuilder withCategory(String category) {
            this.category = category;
            return this;
        }

        public SearchParameterBuilder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public SearchParameterBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public SearchParameterBuilder withPriceRangeUpper(double priceRangeUpper) {
            this.priceRangeUpper = priceRangeUpper;
            return this;
        }

        public SearchParameterBuilder withPriceRangeLower(double priceRangeLower) {
            this.priceRangeLower = priceRangeLower;
            return this;
        }

        public SearchParameter build() {
            SearchParameter searchParameter = new SearchParameter();
            searchParameter.setCategory(category);
            searchParameter.setBrand(brand);
            searchParameter.setColor(color);
            searchParameter.setPriceRangeUpper(priceRangeUpper);
            searchParameter.setPriceRangeLower(priceRangeLower);
            return searchParameter;
        }
    }
}

