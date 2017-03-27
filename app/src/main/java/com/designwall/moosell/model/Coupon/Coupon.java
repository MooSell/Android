package com.designwall.moosell.model.Coupon;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public boolean isIndividual_use() {
        return individual_use;
    }

    public void setIndividual_use(boolean individual_use) {
        this.individual_use = individual_use;
    }

    public List<Integer> getProduct_ids() {
        return product_ids;
    }

    public void setProduct_ids(List<Integer> product_ids) {
        this.product_ids = product_ids;
    }

    public List<Integer> getExclude_product_ids() {
        return exclude_product_ids;
    }

    public void setExclude_product_ids(List<Integer> exclude_product_ids) {
        this.exclude_product_ids = exclude_product_ids;
    }

    public int getUsage_limit() {
        return usage_limit;
    }

    public void setUsage_limit(int usage_limit) {
        this.usage_limit = usage_limit;
    }

    public int getUsage_limit_per_user() {
        return usage_limit_per_user;
    }

    public void setUsage_limit_per_user(int usage_limit_per_user) {
        this.usage_limit_per_user = usage_limit_per_user;
    }

    public int getLimit_usage_to_x_items() {
        return limit_usage_to_x_items;
    }

    public void setLimit_usage_to_x_items(int limit_usage_to_x_items) {
        this.limit_usage_to_x_items = limit_usage_to_x_items;
    }

    public int getUsage_count() {
        return usage_count;
    }

    public void setUsage_count(int usage_count) {
        this.usage_count = usage_count;
    }

    public int getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(int expiry_date) {
        this.expiry_date = expiry_date;
    }

    public boolean isEnable_free_shipping() {
        return enable_free_shipping;
    }

    public void setEnable_free_shipping(boolean enable_free_shipping) {
        this.enable_free_shipping = enable_free_shipping;
    }

    public List<Integer> getProduct_category_ids() {
        return product_category_ids;
    }

    public void setProduct_category_ids(List<Integer> product_category_ids) {
        this.product_category_ids = product_category_ids;
    }

    public List<Integer> getExclude_product_category_ids() {
        return exclude_product_category_ids;
    }

    public void setExclude_product_category_ids(List<Integer> exclude_product_category_ids) {
        this.exclude_product_category_ids = exclude_product_category_ids;
    }

    public boolean isExclude_sale_items() {
        return exclude_sale_items;
    }

    public void setExclude_sale_items(boolean exclude_sale_items) {
        this.exclude_sale_items = exclude_sale_items;
    }

    public String getMinimum_amount() {
        return minimum_amount;
    }

    public void setMinimum_amount(String minimum_amount) {
        this.minimum_amount = minimum_amount;
    }

    public String getMaximum_amount() {
        return maximum_amount;
    }

    public void setMaximum_amount(String maximum_amount) {
        this.maximum_amount = maximum_amount;
    }

    public List<String> getCustomer_emails() {
        return customer_emails;
    }

    public void setCustomer_emails(List<String> customer_emails) {
        this.customer_emails = customer_emails;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
