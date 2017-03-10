package com.designwall.moosell.Model.Product;

/**
 * Created by SCIT on 3/10/2017.
 */

public class ProductAttribute {
    private int id;
    private String name;
    private String slug;
    private String type;
    private String order_by; //Available: menu_order, name, name_num, id
    private boolean has_archives;

    public ProductAttribute(int id, String name, String slug, String type, String order_by, boolean has_archives) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.type = type;
        this.order_by = order_by;
        this.has_archives = has_archives;
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

    public String getType() {
        return type;
    }

    public String getOrder_by() {
        return order_by;
    }

    public boolean isHas_archives() {
        return has_archives;
    }
}
