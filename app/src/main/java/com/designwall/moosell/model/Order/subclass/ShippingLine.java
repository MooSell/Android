package com.designwall.moosell.model.Order.subclass;

/**
 * Created by scit on 3/21/17.
 */

public class ShippingLine {
    private int id;
    private String method_id;
    private String method_title;
    private String total;

    public ShippingLine(int id, String method_id, String method_title, String total) {
        this.id = id;
        this.method_id = method_id;
        this.method_title = method_title;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMethod_id() {
        return method_id;
    }

    public void setMethod_id(String method_id) {
        this.method_id = method_id;
    }

    public String getMethod_title() {
        return method_title;
    }

    public void setMethod_title(String method_title) {
        this.method_title = method_title;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
