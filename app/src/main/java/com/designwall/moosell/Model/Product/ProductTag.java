package com.designwall.moosell.Model.Product;

/**
 * Created by SCIT on 3/10/2017.
 */

public class ProductTag {
    private int id;
    private String name;
    private String slug;
    private String description;
    private int count;

    public ProductTag(int id, String name, String slug, String description, int count) {
        this.id = id;
        this.name = name;
        this.slug = slug;
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

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }
}
