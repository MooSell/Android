package com.designwall.moosell.model.Product;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrder_by() {
        return order_by;
    }

    public void setOrder_by(String order_by) {
        this.order_by = order_by;
    }

    public boolean isHas_archives() {
        return has_archives;
    }

    public void setHas_archives(boolean has_archives) {
        this.has_archives = has_archives;
    }
}
