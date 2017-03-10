package com.designwall.moosell.Model.Coupon;

import java.util.List;

/**
 * Created by SCIT on 3/10/2017.
 */

public class Coupon {
    private int id;
    private String code;
    private String type;
    private String created_at;
    private String updated_at;
    private String amount;
    private boolean individual_use;
    private List<Integer> product_ids;
    private List<Integer> exclude_product_ids;
    private int usage_limit;
    private int usage_limit_per_user;
    private int limit_usage_to_x_items;
    private int usage_count;
    private int expiry_date;
    private boolean enable_free_shipping;
    private List<Integer> product_category_ids;
    private List<Integer> exclude_product_category_ids;
    private boolean exclude_sale_items;
    private String minimum_amount;
    private String maximum_amount;
    private List<String> customer_emails;
    private String description;

    public Coupon(int id, String code, String type, String created_at, String updated_at, String amount, boolean individual_use, List<Integer> product_ids, List<Integer> exclude_product_ids, int usage_limit, int usage_limit_per_user, int limit_usage_to_x_items, int usage_count, int expiry_date, boolean enable_free_shipping, List<Integer> product_category_ids, List<Integer> exclude_product_category_ids, boolean exclude_sale_items, String minimum_amount, String maximum_amount, List<String> customer_emails, String description) {
        this.id = id;
        this.code = code;
        this.type = type;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.amount = amount;
        this.individual_use = individual_use;
        this.product_ids = product_ids;
        this.exclude_product_ids = exclude_product_ids;
        this.usage_limit = usage_limit;
        this.usage_limit_per_user = usage_limit_per_user;
        this.limit_usage_to_x_items = limit_usage_to_x_items;
        this.usage_count = usage_count;
        this.expiry_date = expiry_date;
        this.enable_free_shipping = enable_free_shipping;
        this.product_category_ids = product_category_ids;
        this.exclude_product_category_ids = exclude_product_category_ids;
        this.exclude_sale_items = exclude_sale_items;
        this.minimum_amount = minimum_amount;
        this.maximum_amount = maximum_amount;
        this.customer_emails = customer_emails;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getAmount() {
        return amount;
    }

    public boolean isIndividual_use() {
        return individual_use;
    }

    public List<Integer> getProduct_ids() {
        return product_ids;
    }

    public List<Integer> getExclude_product_ids() {
        return exclude_product_ids;
    }

    public int getUsage_limit() {
        return usage_limit;
    }

    public int getUsage_limit_per_user() {
        return usage_limit_per_user;
    }

    public int getLimit_usage_to_x_items() {
        return limit_usage_to_x_items;
    }

    public int getUsage_count() {
        return usage_count;
    }

    public int getExpiry_date() {
        return expiry_date;
    }

    public boolean isEnable_free_shipping() {
        return enable_free_shipping;
    }

    public List<Integer> getProduct_category_ids() {
        return product_category_ids;
    }

    public List<Integer> getExclude_product_category_ids() {
        return exclude_product_category_ids;
    }

    public boolean isExclude_sale_items() {
        return exclude_sale_items;
    }

    public String getMinimum_amount() {
        return minimum_amount;
    }

    public String getMaximum_amount() {
        return maximum_amount;
    }

    public List<String> getCustomer_emails() {
        return customer_emails;
    }

    public String getDescription() {
        return description;
    }
}
