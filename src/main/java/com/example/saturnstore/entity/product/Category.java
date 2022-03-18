package com.example.saturnstore.entity.product;

import java.util.Set;

public class Category {

    private long id;
    private String name;
    private Category headCategory;
    private Set<Category> subCategory;
    private Set<ProductTemplate> productTemplates;

}
