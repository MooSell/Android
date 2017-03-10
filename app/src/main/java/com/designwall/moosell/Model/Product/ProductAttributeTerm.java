package com.designwall.moosell.Model.Product;

/**
 * Created by SCIT on 3/10/2017.
 */

public class ProductAttributeTerm {
    private int id;
    private String name;
    private String slug;
    private int count;

    public ProductAttributeTerm(int id, String name, String slug, int count) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public int getCount() {
        return count;
    }
}
