package com.designwall.moosell.Model.Customer;

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

    public Customer(int id, String created_at, String email, String first_name, String last_name, String username, String password, int last_order_id, String last_order_date, int orders_count, int total_spent, String avatar_url, List<BillingAddress> billing_address, List<ShippingAddress> shipping_address) {
        this.id = id;
        this.created_at = created_at;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.last_order_id = last_order_id;
        this.last_order_date = last_order_date;
        this.orders_count = orders_count;
        this.total_spent = total_spent;
        this.avatar_url = avatar_url;
        this.billing_address = billing_address;
        this.shipping_address = shipping_address;
    }

    public int getId() {
        return id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getLast_order_id() {
        return last_order_id;
    }

    public String getLast_order_date() {
        return last_order_date;
    }

    public int getOrders_count() {
        return orders_count;
    }

    public int getTotal_spent() {
        return total_spent;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public List<BillingAddress> getBilling_address() {
        return billing_address;
    }

    public List<ShippingAddress> getShipping_address() {
        return shipping_address;
    }

    public class BillingAddress {
        private String first_name;
        private String last_name;
        private String company;
        private String address_1;
        private String address_2;
        private String city;
        private String state;
        private String postcode;
        private String country;
        private String email;
        private String phone;

        public BillingAddress(String first_name, String last_name, String company, String address_1, String address_2, String city, String state, String postcode, String country, String email, String phone) {
            this.first_name = first_name;
            this.last_name = last_name;
            this.company = company;
            this.address_1 = address_1;
            this.address_2 = address_2;
            this.city = city;
            this.state = state;
            this.postcode = postcode;
            this.country = country;
            this.email = email;
            this.phone = phone;
        }

        public String getFirst_name() {
            return first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public String getCompany() {
            return company;
        }

        public String getAddress_1() {
            return address_1;
        }

        public String getAddress_2() {
            return address_2;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getPostcode() {
            return postcode;
        }

        public String getCountry() {
            return country;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }
    }

    public class ShippingAddress {
        private String first_name;
        private String last_name;
        private String company;
        private String address_1;
        private String address_2;
        private String city;
        private String state;
        private String postcode;
        private String country;

        public ShippingAddress(String first_name, String last_name, String company, String address_1, String address_2, String city, String state, String postcode, String country) {
            this.first_name = first_name;
            this.last_name = last_name;
            this.company = company;
            this.address_1 = address_1;
            this.address_2 = address_2;
            this.city = city;
            this.state = state;
            this.postcode = postcode;
            this.country = country;
        }

        public String getFirst_name() {
            return first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public String getCompany() {
            return company;
        }

        public String getAddress_1() {
            return address_1;
        }

        public String getAddress_2() {
            return address_2;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String getPostcode() {
            return postcode;
        }

        public String getCountry() {
            return country;
        }
    }
}
