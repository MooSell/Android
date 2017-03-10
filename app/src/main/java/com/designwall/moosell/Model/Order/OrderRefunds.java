package com.designwall.moosell.Model.Order;

import java.util.List;

/**
 * Created by SCIT on 3/10/2017.
 */

public class OrderRefunds {
    private int id;
    private String created_at;
    private String amount;
    private String reason;
    private List<Order.LineItems> line_items;

    public OrderRefunds(int id, String created_at, String amount, String reason, List<Order.LineItems> line_items) {
        this.id = id;
        this.created_at = created_at;
        this.amount = amount;
        this.reason = reason;
        this.line_items = line_items;
    }

    public int getId() {
        return id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getAmount() {
        return amount;
    }

    public String getReason() {
        return reason;
    }

    public List<Order.LineItems> getLine_items() {
        return line_items;
    }
}
