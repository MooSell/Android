package com.designwall.moosell.model.Order.subclass;

/**
 * Created by scit on 3/21/17.
 */

public class CouponLine {
    private int id;
    private String code;
    private String amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
