package com.designwall.moosell.model.Order;

import com.designwall.moosell.model.Customer.subclass.BillingAddress;
import com.designwall.moosell.model.Customer.Customer;
import com.designwall.moosell.model.Customer.subclass.ShippingAddress;
import com.designwall.moosell.model.Order.subclass.CouponLine;
import com.designwall.moosell.model.Order.subclass.FeeLine;
import com.designwall.moosell.model.Order.subclass.LineItem;
import com.designwall.moosell.model.Order.subclass.PaymentDetail;
import com.designwall.moosell.model.Order.subclass.ShippingLine;
import com.designwall.moosell.model.Order.subclass.TaxLine;

import java.util.List;

/**
 * Created by SCIT on 3/10/2017.
 */

public class Order {
    private int id;
    private int order_number;
    private String created_at;
    private String updated_at;
    private String completed_at;
    private String status;
    private String currency;
    private String total;
    private String subtotal;
    private int total_line_items_quantity;
    private String total_tax;
    private String total_shipping;
    private String cart_tax;
    private String shipping_tax;
    private String total_discount;
    private String shipping_methods;
    private List<PaymentDetail> payment_details;
    private List<BillingAddress> billing_address;
    private List<ShippingAddress> shipping_address;
    private String note;
    private String customer_ip;
    private String customer_user_agent;
    private int customer_id;
    private String view_order_url;
    private List<LineItem> line_items;
    private List<ShippingLine> shipping_lines;
    private List<TaxLine> tax_lines;
    private List<FeeLine> fee_lines;
    private List<CouponLine> coupon_lines;
    private List<Customer> customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCompleted_at() {
        return completed_at;
    }

    public void setCompleted_at(String completed_at) {
        this.completed_at = completed_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public int getTotal_line_items_quantity() {
        return total_line_items_quantity;
    }

    public void setTotal_line_items_quantity(int total_line_items_quantity) {
        this.total_line_items_quantity = total_line_items_quantity;
    }

    public String getTotal_tax() {
        return total_tax;
    }

    public void setTotal_tax(String total_tax) {
        this.total_tax = total_tax;
    }

    public String getTotal_shipping() {
        return total_shipping;
    }

    public void setTotal_shipping(String total_shipping) {
        this.total_shipping = total_shipping;
    }

    public String getCart_tax() {
        return cart_tax;
    }

    public void setCart_tax(String cart_tax) {
        this.cart_tax = cart_tax;
    }

    public String getShipping_tax() {
        return shipping_tax;
    }

    public void setShipping_tax(String shipping_tax) {
        this.shipping_tax = shipping_tax;
    }

    public String getTotal_discount() {
        return total_discount;
    }

    public void setTotal_discount(String total_discount) {
        this.total_discount = total_discount;
    }

    public String getShipping_methods() {
        return shipping_methods;
    }

    public void setShipping_methods(String shipping_methods) {
        this.shipping_methods = shipping_methods;
    }

    public List<PaymentDetail> getPayment_details() {
        return payment_details;
    }

    public void setPayment_details(List<PaymentDetail> payment_details) {
        this.payment_details = payment_details;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCustomer_ip() {
        return customer_ip;
    }

    public void setCustomer_ip(String customer_ip) {
        this.customer_ip = customer_ip;
    }

    public String getCustomer_user_agent() {
        return customer_user_agent;
    }

    public void setCustomer_user_agent(String customer_user_agent) {
        this.customer_user_agent = customer_user_agent;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getView_order_url() {
        return view_order_url;
    }

    public void setView_order_url(String view_order_url) {
        this.view_order_url = view_order_url;
    }

    public List<LineItem> getLine_items() {
        return line_items;
    }

    public void setLine_items(List<LineItem> line_items) {
        this.line_items = line_items;
    }

    public List<ShippingLine> getShipping_lines() {
        return shipping_lines;
    }

    public void setShipping_lines(List<ShippingLine> shipping_lines) {
        this.shipping_lines = shipping_lines;
    }

    public List<TaxLine> getTax_lines() {
        return tax_lines;
    }

    public void setTax_lines(List<TaxLine> tax_lines) {
        this.tax_lines = tax_lines;
    }

    public List<FeeLine> getFee_lines() {
        return fee_lines;
    }

    public void setFee_lines(List<FeeLine> fee_lines) {
        this.fee_lines = fee_lines;
    }

    public List<CouponLine> getCoupon_lines() {
        return coupon_lines;
    }

    public void setCoupon_lines(List<CouponLine> coupon_lines) {
        this.coupon_lines = coupon_lines;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

}
