package com.designwall.moosell.Model.Order;

/**
 * Created by SCIT on 3/10/2017.
 */

public class OrderNote {
    private int id;
    private String created_at;
    private String note;
    private boolean customer_note;

    public OrderNote(int id, String created_at, String note, boolean customer_note) {
        this.id = id;
        this.created_at = created_at;
        this.note = note;
        this.customer_note = customer_note;
    }

    public int getId() {
        return id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getNote() {
        return note;
    }

    public boolean isCustomer_note() {
        return customer_note;
    }
}
