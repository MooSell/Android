package com.designwall.moosell.Model.Tax;

import com.google.gson.annotations.SerializedName;

/**
 * Created by SCIT on 3/10/2017.
 */

public class Tax {
    private int id;
    private String country;
    private String state;
    private String postcode;
    private String city;
    private String rate;
    private String name;
    private int priority;
    private boolean compound;
    private boolean shipping;
    private int order;
    @SerializedName("class")
    private String tax_class; //Default: standard

    public Tax(int id, String country, String state, String postcode, String city, String rate, String name, int priority, boolean compound, boolean shipping, int order, String tax_class) {
        this.id = id;
        this.country = country;
        this.state = state;
        this.postcode = postcode;
        this.city = city;
        this.rate = rate;
        this.name = name;
        this.priority = priority;
        this.compound = compound;
        this.shipping = shipping;
        this.order = order;
        this.tax_class = tax_class;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    public String getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompound() {
        return compound;
    }

    public boolean isShipping() {
        return shipping;
    }

    public int getOrder() {
        return order;
    }

    public String getTax_class() {
        return tax_class;
    }
}
