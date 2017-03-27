package com.designwall.moosell.model.Product;

import com.designwall.moosell.model.Product.subclass.Attribute;
import com.designwall.moosell.model.Product.subclass.DefaultAttribute;
import com.designwall.moosell.model.Product.subclass.Dimensions;
import com.designwall.moosell.model.Product.subclass.Download;
import com.designwall.moosell.model.Product.subclass.Image;
import com.designwall.moosell.model.Product.subclass.Variation;

import java.util.List;

/**
 * Created by SCIT on 3/10/2017.
 */

public class Product {
    private String title;
    private int id;
    private String name;
    private String created_at;
    private String updated_at;
    private String type;
    private String status;
    private boolean downloadable;
    private boolean virtual;
    private String permalink;
    private String sku;
    private String price;
    private String regular_price;
    private String sale_price;
    private String sale_price_dates_from;
    private String sale_price_dates_to;
    private String price_html;
    private boolean taxable;
    private String tax_status;
    private String tax_class;
    private boolean managing_stock;
    private int stock_quantity;
    private boolean in_stock;
    private boolean backorders_allowed;
    private boolean backordered;
    private String backorders;
    private boolean sold_individually;
    private boolean purchaseable;
    private boolean featured;
    private boolean visible;
    private String catalog_visibility;
    private boolean on_sale;
    private String weight;
    private Dimensions dimensions;
    private boolean shipping_required;
    private boolean shipping_taxable;
    private String shipping_class;
    private int shipping_class_id;
    private String description;
    private boolean enable_html_description;
    private String short_description;
    private String enable_html_short_description;
    private boolean reviews_allowed;
    private String average_rating;
    private int rating_count;
    private List<Integer> related_ids;
    private List<Integer> upsell_ids;
    private List<Integer> cross_sell_ids;
    private int parent_id;
    private List<String> categories;    //In write-mode need to pass a array of categories IDs
    private List<String> tags;          //In write-mode need to pass a array of tags IDs
    private List<Image> images;
    private String featured_src;
    private List<Attribute> attributes; // the attribute must be registered in WooCommerce before.
    private List<DefaultAttribute> default_attributes;
    private List<Download> downloads;
    private int download_limit;
    private int download_expiry;
    private String download_type;
    private String purchase_note;
    private int total_sales;
    private List<Variation> variations;
    private List<String> parent;
    private String product_url;
    private String button_text;
    private int menu_order;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isDownloadable() {
        return downloadable;
    }

    public void setDownloadable(boolean downloadable) {
        this.downloadable = downloadable;
    }

    public boolean isVirtual() {
        return virtual;
    }

    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRegular_price() {
        return regular_price;
    }

    public void setRegular_price(String regular_price) {
        this.regular_price = regular_price;
    }

    public String getSale_price() {
        return sale_price;
    }

    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;
    }

    public String getSale_price_dates_from() {
        return sale_price_dates_from;
    }

    public void setSale_price_dates_from(String sale_price_dates_from) {
        this.sale_price_dates_from = sale_price_dates_from;
    }

    public String getSale_price_dates_to() {
        return sale_price_dates_to;
    }

    public void setSale_price_dates_to(String sale_price_dates_to) {
        this.sale_price_dates_to = sale_price_dates_to;
    }

    public String getPrice_html() {
        return price_html;
    }

    public void setPrice_html(String price_html) {
        this.price_html = price_html;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public String getTax_status() {
        return tax_status;
    }

    public void setTax_status(String tax_status) {
        this.tax_status = tax_status;
    }

    public String getTax_class() {
        return tax_class;
    }

    public void setTax_class(String tax_class) {
        this.tax_class = tax_class;
    }

    public boolean isManaging_stock() {
        return managing_stock;
    }

    public void setManaging_stock(boolean managing_stock) {
        this.managing_stock = managing_stock;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public boolean isIn_stock() {
        return in_stock;
    }

    public void setIn_stock(boolean in_stock) {
        this.in_stock = in_stock;
    }

    public boolean isBackorders_allowed() {
        return backorders_allowed;
    }

    public void setBackorders_allowed(boolean backorders_allowed) {
        this.backorders_allowed = backorders_allowed;
    }

    public boolean isBackordered() {
        return backordered;
    }

    public void setBackordered(boolean backordered) {
        this.backordered = backordered;
    }

    public String getBackorders() {
        return backorders;
    }

    public void setBackorders(String backorders) {
        this.backorders = backorders;
    }

    public boolean isSold_individually() {
        return sold_individually;
    }

    public void setSold_individually(boolean sold_individually) {
        this.sold_individually = sold_individually;
    }

    public boolean isPurchaseable() {
        return purchaseable;
    }

    public void setPurchaseable(boolean purchaseable) {
        this.purchaseable = purchaseable;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getCatalog_visibility() {
        return catalog_visibility;
    }

    public void setCatalog_visibility(String catalog_visibility) {
        this.catalog_visibility = catalog_visibility;
    }

    public boolean isOn_sale() {
        return on_sale;
    }

    public void setOn_sale(boolean on_sale) {
        this.on_sale = on_sale;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public boolean isShipping_required() {
        return shipping_required;
    }

    public void setShipping_required(boolean shipping_required) {
        this.shipping_required = shipping_required;
    }

    public boolean isShipping_taxable() {
        return shipping_taxable;
    }

    public void setShipping_taxable(boolean shipping_taxable) {
        this.shipping_taxable = shipping_taxable;
    }

    public String getShipping_class() {
        return shipping_class;
    }

    public void setShipping_class(String shipping_class) {
        this.shipping_class = shipping_class;
    }

    public int getShipping_class_id() {
        return shipping_class_id;
    }

    public void setShipping_class_id(int shipping_class_id) {
        this.shipping_class_id = shipping_class_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnable_html_description() {
        return enable_html_description;
    }

    public void setEnable_html_description(boolean enable_html_description) {
        this.enable_html_description = enable_html_description;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getEnable_html_short_description() {
        return enable_html_short_description;
    }

    public void setEnable_html_short_description(String enable_html_short_description) {
        this.enable_html_short_description = enable_html_short_description;
    }

    public boolean isReviews_allowed() {
        return reviews_allowed;
    }

    public void setReviews_allowed(boolean reviews_allowed) {
        this.reviews_allowed = reviews_allowed;
    }

    public String getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(String average_rating) {
        this.average_rating = average_rating;
    }

    public int getRating_count() {
        return rating_count;
    }

    public void setRating_count(int rating_count) {
        this.rating_count = rating_count;
    }

    public List<Integer> getRelated_ids() {
        return related_ids;
    }

    public void setRelated_ids(List<Integer> related_ids) {
        this.related_ids = related_ids;
    }

    public List<Integer> getUpsell_ids() {
        return upsell_ids;
    }

    public void setUpsell_ids(List<Integer> upsell_ids) {
        this.upsell_ids = upsell_ids;
    }

    public List<Integer> getCross_sell_ids() {
        return cross_sell_ids;
    }

    public void setCross_sell_ids(List<Integer> cross_sell_ids) {
        this.cross_sell_ids = cross_sell_ids;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getFeatured_src() {
        return featured_src;
    }

    public void setFeatured_src(String featured_src) {
        this.featured_src = featured_src;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<DefaultAttribute> getDefault_attributes() {
        return default_attributes;
    }

    public void setDefault_attributes(List<DefaultAttribute> default_attributes) {
        this.default_attributes = default_attributes;
    }

    public List<Download> getDownloads() {
        return downloads;
    }

    public void setDownloads(List<Download> downloads) {
        this.downloads = downloads;
    }

    public int getDownload_limit() {
        return download_limit;
    }

    public void setDownload_limit(int download_limit) {
        this.download_limit = download_limit;
    }

    public int getDownload_expiry() {
        return download_expiry;
    }

    public void setDownload_expiry(int download_expiry) {
        this.download_expiry = download_expiry;
    }

    public String getDownload_type() {
        return download_type;
    }

    public void setDownload_type(String download_type) {
        this.download_type = download_type;
    }

    public String getPurchase_note() {
        return purchase_note;
    }

    public void setPurchase_note(String purchase_note) {
        this.purchase_note = purchase_note;
    }

    public int getTotal_sales() {
        return total_sales;
    }

    public void setTotal_sales(int total_sales) {
        this.total_sales = total_sales;
    }

    public List<Variation> getVariations() {
        return variations;
    }

    public void setVariations(List<Variation> variations) {
        this.variations = variations;
    }

    public List<String> getParent() {
        return parent;
    }

    public void setParent(List<String> parent) {
        this.parent = parent;
    }

    public String getProduct_url() {
        return product_url;
    }

    public void setProduct_url(String product_url) {
        this.product_url = product_url;
    }

    public String getButton_text() {
        return button_text;
    }

    public void setButton_text(String button_text) {
        this.button_text = button_text;
    }

    public int getMenu_order() {
        return menu_order;
    }

    public void setMenu_order(int menu_order) {
        this.menu_order = menu_order;
    }

}
