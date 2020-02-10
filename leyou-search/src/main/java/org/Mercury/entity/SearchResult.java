package org.Mercury.entity;

import org.Mercury.common.entity.PageResult;

import java.util.List;
import java.util.Map;

public class SearchResult extends PageResult<Goods> {
    private List<Map<String, Object>> categories;
    private List<Brand> brands;

    public List<Map<String, Object>> getCategories() {
        return categories;
    }

    public void setCategories(List<Map<String, Object>> categories) {
        this.categories = categories;
    }

    public SearchResult(Long total, Integer totalPage, List<Goods> items, List<Map<String, Object>> categories, List<Brand> brands) {
        super(total, totalPage, items);
        this.categories = categories;
        this.brands = brands;
    }

    public SearchResult(Long total, Integer totalPage, List<Goods> items) {
        super(total, totalPage, items);
    }

    public SearchResult() {
    }

    public SearchResult(Long total, List<Goods> items) {
        super(total, items);
    }

    public SearchResult(List<Map<String, Object>> categories, List<Brand> brands) {
        this.categories = categories;
        this.brands = brands;
    }

    public SearchResult(Long total, List<Goods> items, List<Map<String, Object>> categories, List<Brand> brands) {
        super(total, items);
        this.categories = categories;
        this.brands = brands;
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }
}
