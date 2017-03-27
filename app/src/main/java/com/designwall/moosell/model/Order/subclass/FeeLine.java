package com.designwall.moosell.model.Order.subclass;

/**
 * Created by scit on 3/21/17.
 */

public class FeeLine {
    private int id;
    private String title;
    private boolean taxable;
    private String tax_class;
    private String total;
    private String total_tax;

    public FeeLine(int id, String title, boolean taxable, String tax_class, String total, String total_tax) {
        this.id = id;
        this.title = title;
        this.taxable = taxable;
        this.tax_class = tax_class;
        this.total = total;
        this.total_tax = total_tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public String getTax_class() {
        return tax_class;
    }

    public void setTax_class(String tax_class) {
        this.tax_class = tax_class;
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
}