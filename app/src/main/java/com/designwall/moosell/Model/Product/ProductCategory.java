package com.designwall.moosell.Model.Product;

/**
 * Created by SCIT on 3/10/2017.
 */

public class ProductCategory {
    private int id;
    private String name;
    private String slug;
    private int parent;
    private String description;
    private String display; //Available: default, products, subcategories and both
    private String image;
    private int count;

    public ProductCategory(int id, String name, String slug, int parent, String description, String display, String image, int count) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.parent = parent;
        this.description = description;
        this.display = display;
        this.image = image;
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

    public String getDisplay() {
        return display;
    }

    public String getImage() {
        return image;
    }

    public int getCount() {
        return count;
    }
}
