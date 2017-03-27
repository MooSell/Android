package com.designwall.moosell.model.Customer;

import com.designwall.moosell.model.Customer.subclass.BillingAddress;
import com.designwall.moosell.model.Customer.subclass.ShippingAddress;

import java.util.List;

/**
 * Created by SCIT on 3/10/2017.
 */

public class Customer {
    private int id;
    private String created_at;
    private String email;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private int last_order_id;
    private String last_order_date;
    private int orders_count;
    private int total_spent;
    private String avatar_url;
    private List<BillingAddress> billing_address;
    private List<ShippingAddress> shipping_address;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLast_order_id() {
        return last_order_id;
    }

    public void setLast_order_id(int last_order_id) {
        this.last_order_id = last_order_id;
    }

    public String getLast_order_date() {
        return last_order_date;
    }

    public void setLast_order_date(String last_order_date) {
        this.last_order_date = last_order_date;
    }

    public int getOrders_count() {
        return orders_count;
    }

    public void setOrders_count(int orders_count) {
        this.orders_count = orders_count;
    }

    public int getTotal_spent() {
        return total_spent;
    }

    public void setTotal_spent(int total_spent) {
        this.total_spent = total_spent;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public List<BillingAddress> getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(List<BillingAddress> billing_address) {
        this.billing_address = billing_address;
    }

    public List<ShippingAddress> getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(List<ShippingAddress> shipping_address) {
        this.shipping_address = shipping_address;
    }

}
