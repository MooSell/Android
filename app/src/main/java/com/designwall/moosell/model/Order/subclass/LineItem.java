package com.designwall.moosell.model.Order.subclass;

import com.designwall.moosell.model.Product.Product;
import com.designwall.moosell.model.Product.subclass.MetaItem;

import java.util.List;

/**
 * Created by scit on 3/21/17.
 */

public class LineItem {
    private int id;
    private String subtotal;
    private String subtotal_tax;
    private String total;
    private String total_tax;
    private String price;
    private int quantity;
    private String tax_class;
    private String name;
    private int product_id;
    private String sku;
    private List<MetaItem> meta;
    private String variations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getSubtotal_tax() {
        return subtotal_tax;
    }

    public void setSubtotal_tax(String subtotal_tax) {
        this.subtotal_tax = subtotal_tax;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_tax() {
        return total_tax;
    }

    public void setTotal_tax(String total_tax) {
        this.total_tax = total_tax;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTax_class() {
        return tax_class;
    }

    public void setTax_class(String tax_class) {
        this.tax_class = tax_class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<MetaItem> getMeta() {
        return meta;
    }

    public void setMeta(List<MetaItem> meta) {
        this.meta = meta;
    }

    public String getVariations() {
        return variations;
    }

    public void setVariations(String variations) {
        this.variations = variations;
    }
}
