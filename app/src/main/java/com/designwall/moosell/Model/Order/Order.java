package com.designwall.moosell.Model.Order;

import com.designwall.moosell.Model.Customer.Customer;
import com.designwall.moosell.Model.Product.Product;

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
    private List<Customer.BillingAddress> billing_address;
    private List<Customer.ShippingAddress> shipping_address;
    private String note;
    private String customer_ip;
    private String customer_user_agent;
    private int customer_id;
    private String view_order_url;
    private List<LineItems> line_items;
    private List<ShippingLines> shipping_lines;
    private List<TaxLines> tax_lines;
    private List<FeeLines> fee_lines;
    private List<CouponLines> coupon_lines;
    private List<Customer> customer;

    public Order(int id, int order_number, String created_at, String updated_at, String completed_at, String status, String currency, String total, String subtotal, int total_line_items_quantity, String total_tax, String total_shipping, String cart_tax, String shipping_tax, String total_discount, String shipping_methods, List<PaymentDetail> payment_details, List<Customer.BillingAddress> billing_address, List<Customer.ShippingAddress> shipping_address, String note, String customer_ip, String customer_user_agent, int customer_id, String view_order_url, List<LineItems> line_items, List<ShippingLines> shipping_lines, List<TaxLines> tax_lines, List<FeeLines> fee_lines, List<CouponLines> coupon_lines, List<Customer> customer) {
        this.id = id;
        this.order_number = order_number;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.completed_at = completed_at;
        this.status = status;
        this.currency = currency;
        this.total = total;
        this.subtotal = subtotal;
        this.total_line_items_quantity = total_line_items_quantity;
        this.total_tax = total_tax;
        this.total_shipping = total_shipping;
        this.cart_tax = cart_tax;
        this.shipping_tax = shipping_tax;
        this.total_discount = total_discount;
        this.shipping_methods = shipping_methods;
        this.payment_details = payment_details;
        this.billing_address = billing_address;
        this.shipping_address = shipping_address;
        this.note = note;
        this.customer_ip = customer_ip;
        this.customer_user_agent = customer_user_agent;
        this.customer_id = customer_id;
        this.view_order_url = view_order_url;
        this.line_items = line_items;
        this.shipping_lines = shipping_lines;
        this.tax_lines = tax_lines;
        this.fee_lines = fee_lines;
        this.coupon_lines = coupon_lines;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public int getOrder_number() {
        return order_number;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getCompleted_at() {
        return completed_at;
    }

    public String getStatus() {
        return status;
    }

    public String getCurrency() {
        return currency;
    }

    public String getTotal() {
        return total;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public int getTotal_line_items_quantity() {
        return total_line_items_quantity;
    }

    public String getTotal_tax() {
        return total_tax;
    }

    public String getTotal_shipping() {
        return total_shipping;
    }

    public String getCart_tax() {
        return cart_tax;
    }

    public String getShipping_tax() {
        return shipping_tax;
    }

    public String getTotal_discount() {
        return total_discount;
    }

    public String getShipping_methods() {
        return shipping_methods;
    }

    public List<PaymentDetail> getPayment_details() {
        return payment_details;
    }

    public List<Customer.BillingAddress> getBilling_address() {
        return billing_address;
    }

    public List<Customer.ShippingAddress> getShipping_address() {
        return shipping_address;
    }

    public String getNote() {
        return note;
    }

    public String getCustomer_ip() {
        return customer_ip;
    }

    public String getCustomer_user_agent() {
        return customer_user_agent;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getView_order_url() {
        return view_order_url;
    }

    public List<LineItems> getLine_items() {
        return line_items;
    }

    public List<ShippingLines> getShipping_lines() {
        return shipping_lines;
    }

    public List<TaxLines> getTax_lines() {
        return tax_lines;
    }

    public List<FeeLines> getFee_lines() {
        return fee_lines;
    }

    public List<CouponLines> getCoupon_lines() {
        return coupon_lines;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public class PaymentDetail {
        private String method_id;
        private String method_title;
        private boolean paid;
        private String transaction_id;

        public PaymentDetail(String method_id, String method_title, boolean paid, String transaction_id) {
            this.method_id = method_id;
            this.method_title = method_title;
            this.paid = paid;
            this.transaction_id = transaction_id;
        }

        public String getMethod_id() {
            return method_id;
        }

        public String getMethod_title() {
            return method_title;
        }

        public boolean isPaid() {
            return paid;
        }

        public String getTransaction_id() {
            return transaction_id;
        }
    }

    public class LineItems {
        private int id;
        private String subtotal;
        private String subtotal_tax;
        private String total;
        private String total_tax;
        private String price;
        private int quantity;
        private String tax_class;
        private String name;
        private int product_id;
        private String sku;
        private List<Product.MetaItem> meta;
        private String variations;
    }

    public class ShippingLines {
        private int id;
        private String method_id;
        private String method_title;
        private String total;

        public ShippingLines(int id, String method_id, String method_title, String total) {
            this.id = id;
            this.method_id = method_id;
            this.method_title = method_title;
            this.total = total;
        }

        public int getId() {
            return id;
        }

        public String getMethod_id() {
            return method_id;
        }

        public String getMethod_title() {
            return method_title;
        }

        public String getTotal() {
            return total;
        }
    }

    public class TaxLines {
        private int id;
        private int rate_id;
        private String code;
        private String title;
        private String total;
        private boolean compound;

        public TaxLines(int id, int rate_id, String code, String title, String total, boolean compound) {
            this.id = id;
            this.rate_id = rate_id;
            this.code = code;
            this.title = title;
            this.total = total;
            this.compound = compound;
        }

        public int getId() {
            return id;
        }

        public int getRate_id() {
            return rate_id;
        }

        public String getCode() {
            return code;
        }

        public String getTitle() {
            return title;
        }

        public String getTotal() {
            return total;
        }

        public boolean isCompound() {
            return compound;
        }
    }

    public class FeeLines {
        private int id;
        private String title;
        private boolean taxable;
        private String tax_class;
        private String total;
        private String total_tax;

        public FeeLines(int id, String title, boolean taxable, String tax_class, String total, String total_tax) {
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

        public String getTitle() {
            return title;
        }

        public boolean isTaxable() {
            return taxable;
        }

        public String getTax_class() {
            return tax_class;
        }

        public String getTotal() {
            return total;
        }

        public String getTotal_tax() {
            return total_tax;
        }
    }

    public class CouponLines {
        private int id;
        private String code;
        private String amount;

        public CouponLines(int id, String code, String amount) {
            this.id = id;
            this.code = code;
            this.amount = amount;
        }

        public int getId() {
            return id;
        }

        public String getCode() {
            return code;
        }

        public String getAmount() {
            return amount;
        }
    }
}
