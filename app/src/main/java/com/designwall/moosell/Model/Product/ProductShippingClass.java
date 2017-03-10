package com.designwall.moosell.Model.Product;

/**
 * Created by SCIT on 3/10/2017.
 */

public class ProductShippingClass {
    private int id;
    private String name;
    private String slug;
    private int parent;
    private String description;
    private int count;

    public ProductShippingClass(int id, String name, String slug, int parent, String description, int count) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.parent = parent;
        this.description = description;
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

    public int getParent() {
        return parent;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }
}
