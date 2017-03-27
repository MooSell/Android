package com.designwall.moosell.model.Order;

/**
 * Created by SCIT on 3/10/2017.
 */

public class OrderNote {
    private int id;
    private String created_at;
    private String note;
    private boolean customer_note;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isCustomer_note() {
        return customer_note;
    }

    public void setCustomer_note(boolean customer_note) {
        this.customer_note = customer_note;
    }
}
