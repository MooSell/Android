package com.designwall.moosell.model.Order;

import com.designwall.moosell.model.Order.subclass.LineItem;

import java.util.List;

/**
 * Created by SCIT on 3/10/2017.
 */

public class OrderRefunds {
    private int id;
    private String created_at;
    private String amount;
    private String reason;
    private List<LineItem> line_items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<LineItem> getLine_items() {
        return line_items;
    }

    public void setLine_items(List<LineItem> line_items) {
        this.line_items = line_items;
    }
}
