package com.designwall.moosell.Model.Product;

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
    private List<Dimension> dimensions;
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

    public Product(String title, int id, String name, String created_at, String updated_at, String type, String status, boolean downloadable, boolean virtual, String permalink, String sku, String price, String regular_price, String sale_price, String sale_price_dates_from, String sale_price_dates_to, String price_html, boolean taxable, String tax_status, String tax_class, boolean managing_stock, int stock_quantity, boolean in_stock, boolean backorders_allowed, boolean backordered, String backorders, boolean sold_individually, boolean purchaseable, boolean featured, boolean visible, String catalog_visibility, boolean on_sale, String weight, List<Dimension> dimensions, boolean shipping_required, boolean shipping_taxable, String shipping_class, int shipping_class_id, String description, boolean enable_html_description, String short_description, String enable_html_short_description, boolean reviews_allowed, String average_rating, int rating_count, List<Integer> related_ids, List<Integer> upsell_ids, List<Integer> cross_sell_ids, int parent_id, List<String> categories, List<String> tags, List<Image> images, String featured_src, List<Attribute> attributes, List<DefaultAttribute> default_attributes, List<Download> downloads, int download_limit, int download_expiry, String download_type, String purchase_note, int total_sales, List<Variation> variations, List<String> parent, String product_url, String button_text, int menu_order) {
        this.title = title;
        this.id = id;
        this.name = name;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.type = type;
        this.status = status;
        this.downloadable = downloadable;
        this.virtual = virtual;
        this.permalink = permalink;
        this.sku = sku;
        this.price = price;
        this.regular_price = regular_price;
        this.sale_price = sale_price;
        this.sale_price_dates_from = sale_price_dates_from;
        this.sale_price_dates_to = sale_price_dates_to;
        this.price_html = price_html;
        this.taxable = taxable;
        this.tax_status = tax_status;
        this.tax_class = tax_class;
        this.managing_stock = managing_stock;
        this.stock_quantity = stock_quantity;
        this.in_stock = in_stock;
        this.backorders_allowed = backorders_allowed;
        this.backordered = backordered;
        this.backorders = backorders;
        this.sold_individually = sold_individually;
        this.purchaseable = purchaseable;
        this.featured = featured;
        this.visible = visible;
        this.catalog_visibility = catalog_visibility;
        this.on_sale = on_sale;
        this.weight = weight;
        this.dimensions = dimensions;
        this.shipping_required = shipping_required;
        this.shipping_taxable = shipping_taxable;
        this.shipping_class = shipping_class;
        this.shipping_class_id = shipping_class_id;
        this.description = description;
        this.enable_html_description = enable_html_description;
        this.short_description = short_description;
        this.enable_html_short_description = enable_html_short_description;
        this.reviews_allowed = reviews_allowed;
        this.average_rating = average_rating;
        this.rating_count = rating_count;
        this.related_ids = related_ids;
        this.upsell_ids = upsell_ids;
        this.cross_sell_ids = cross_sell_ids;
        this.parent_id = parent_id;
        this.categories = categories;
        this.tags = tags;
        this.images = images;
        this.featured_src = featured_src;
        this.attributes = attributes;
        this.default_attributes = default_attributes;
        this.downloads = downloads;
        this.download_limit = download_limit;
        this.download_expiry = download_expiry;
        this.download_type = download_type;
        this.purchase_note = purchase_note;
        this.total_sales = total_sales;
        this.variations = variations;
        this.parent = parent;
        this.product_url = product_url;
        this.button_text = button_text;
        this.menu_order = menu_order;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public boolean isDownloadable() {
        return downloadable;
    }

    public boolean isVirtual() {
        return virtual;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getSku() {
        return sku;
    }

    public String getPrice() {
        return price;
    }

    public String getRegular_price() {
        return regular_price;
    }

    public String getSale_price() {
        return sale_price;
    }

    public String getSale_price_dates_from() {
        return sale_price_dates_from;
    }

    public String getSale_price_dates_to() {
        return sale_price_dates_to;
    }

    public String getPrice_html() {
        return price_html;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public String getTax_status() {
        return tax_status;
    }

    public String getTax_class() {
        return tax_class;
    }

    public boolean isManaging_stock() {
        return managing_stock;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public boolean isIn_stock() {
        return in_stock;
    }

    public boolean isBackorders_allowed() {
        return backorders_allowed;
    }

    public boolean isBackordered() {
        return backordered;
    }

    public String getBackorders() {
        return backorders;
    }

    public boolean isSold_individually() {
        return sold_individually;
    }

    public boolean isPurchaseable() {
        return purchaseable;
    }

    public boolean isFeatured() {
        return featured;
    }

    public boolean isVisible() {
        return visible;
    }

    public String getCatalog_visibility() {
        return catalog_visibility;
    }

    public boolean isOn_sale() {
        return on_sale;
    }

    public String getWeight() {
        return weight;
    }

    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public boolean isShipping_required() {
        return shipping_required;
    }

    public boolean isShipping_taxable() {
        return shipping_taxable;
    }

    public String getShipping_class() {
        return shipping_class;
    }

    public int getShipping_class_id() {
        return shipping_class_id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isEnable_html_description() {
        return enable_html_description;
    }

    public String getShort_description() {
        return short_description;
    }

    public String getEnable_html_short_description() {
        return enable_html_short_description;
    }

    public boolean isReviews_allowed() {
        return reviews_allowed;
    }

    public String getAverage_rating() {
        return average_rating;
    }

    public int getRating_count() {
        return rating_count;
    }

    public List<Integer> getRelated_ids() {
        return related_ids;
    }

    public List<Integer> getUpsell_ids() {
        return upsell_ids;
    }

    public List<Integer> getCross_sell_ids() {
        return cross_sell_ids;
    }

    public int getParent_id() {
        return parent_id;
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<Image> getImages() {
        return images;
    }

    public String getFeatured_src() {
        return featured_src;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public List<DefaultAttribute> getDefault_attributes() {
        return default_attributes;
    }

    public List<Download> getDownloads() {
        return downloads;
    }

    public int getDownload_limit() {
        return download_limit;
    }

    public int getDownload_expiry() {
        return download_expiry;
    }

    public String getDownload_type() {
        return download_type;
    }

    public String getPurchase_note() {
        return purchase_note;
    }

    public int getTotal_sales() {
        return total_sales;
    }

    public List<Variation> getVariations() {
        return variations;
    }

    public List<String> getParent() {
        return parent;
    }

    public String getProduct_url() {
        return product_url;
    }

    public String getButton_text() {
        return button_text;
    }

    public int getMenu_order() {
        return menu_order;
    }

    public class MetaItem {
        private String key;
        private String label;
        private String value;

        public MetaItem(String key, String label, String value) {
            this.key = key;
            this.label = label;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getLabel() {
            return label;
        }

        public String getValue() {
            return value;
        }
    }

    public class Dimension {
        private String length;
        private String width;
        private String height;
        private String unit;

        public Dimension(String length, String width, String height, String unit) {
            this.length = length;
            this.width = width;
            this.height = height;
            this.unit = unit;
        }

        public String getLength() {
            return length;
        }

        public String getWidth() {
            return width;
        }

        public String getHeight() {
            return height;
        }

        public String getUnit() {
            return unit;
        }
    }

    public class Image {
        private int id;
        private String created_at;
        private String updated_at;
        private String src;
        private String title;
        private String alt;
        private int position;

        public Image(int id, String created_at, String updated_at, String src, String title, String alt, int position) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.src = src;
            this.title = title;
            this.alt = alt;
            this.position = position;
        }

        public int getId() {
            return id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public String getSrc() {
            return src;
        }

        public String getTitle() {
            return title;
        }

        public String getAlt() {
            return alt;
        }

        public int getPosition() {
            return position;
        }
    }

    public class Attribute {
        private String name;
        private String slug;
        private int position;
        private boolean visible;
        private boolean variation;
        private List<String> options;

        public Attribute(String name, String slug, int position, boolean visible, boolean variation, List<String> options) {
            this.name = name;
            this.slug = slug;
            this.position = position;
            this.visible = visible;
            this.variation = variation;
            this.options = options;
        }

        public String getName() {
            return name;
        }

        public String getSlug() {
            return slug;
        }

        public int getPosition() {
            return position;
        }

        public boolean isVisible() {
            return visible;
        }

        public boolean isVariation() {
            return variation;
        }

        public List<String> getOptions() {
            return options;
        }
    }

    public class DefaultAttribute {
        private String name;
        private String slug;
        private String option;

        public DefaultAttribute(String name, String slug, String option) {
            this.name = name;
            this.slug = slug;
            this.option = option;
        }

        public String getName() {
            return name;
        }

        public String getSlug() {
            return slug;
        }

        public String getOption() {
            return option;
        }
    }

    public class Download {
        private String id;
        private String name;
        private String file;

        public Download(String id, String name, String file) {
            this.id = id;
            this.name = name;
            this.file = file;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getFile() {
            return file;
        }
    }

    public class Variation {
        private int id;
        private String created_at;
        private String updated_at;
        private boolean downloadable;
        private boolean virtual;
        private String permalink;
        private String sku;
        private String price;
        private String regular_price;
        private String sale_price;
        private String sale_price_dates_from;
        private String sale_price_dates_to;
        private boolean taxable;
        private String tax_status;
        private String tax_class;
        private boolean managing_stock;
        private int stock_quantity;
        private boolean in_stock;
        private boolean backordered;
        private boolean purchaseable;
        private boolean visible;
        private boolean on_sale;
        private String weight;
        private List<Dimension> dimensions;
        private String shipping_class;
        private int shipping_class_id;
        private List<Image> image;
        private List<Attribute> attributes;
        private List<Download> downloads;
        private int download_limit;
        private int download_expiry;

        public Variation(int id, String created_at, String updated_at, boolean downloadable, boolean virtual, String permalink, String sku, String price, String regular_price, String sale_price, String sale_price_dates_from, String sale_price_dates_to, boolean taxable, String tax_status, String tax_class, boolean managing_stock, int stock_quantity, boolean in_stock, boolean backordered, boolean purchaseable, boolean visible, boolean on_sale, String weight, List<Dimension> dimensions, String shipping_class, int shipping_class_id, List<Image> image, List<Attribute> attributes, List<Download> downloads, int download_limit, int download_expiry) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.downloadable = downloadable;
            this.virtual = virtual;
            this.permalink = permalink;
            this.sku = sku;
            this.price = price;
            this.regular_price = regular_price;
            this.sale_price = sale_price;
            this.sale_price_dates_from = sale_price_dates_from;
            this.sale_price_dates_to = sale_price_dates_to;
            this.taxable = taxable;
            this.tax_status = tax_status;
            this.tax_class = tax_class;
            this.managing_stock = managing_stock;
            this.stock_quantity = stock_quantity;
            this.in_stock = in_stock;
            this.backordered = backordered;
            this.purchaseable = purchaseable;
            this.visible = visible;
            this.on_sale = on_sale;
            this.weight = weight;
            this.dimensions = dimensions;
            this.shipping_class = shipping_class;
            this.shipping_class_id = shipping_class_id;
            this.image = image;
            this.attributes = attributes;
            this.downloads = downloads;
            this.download_limit = download_limit;
            this.download_expiry = download_expiry;
        }

        public int getId() {
            return id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public boolean isDownloadable() {
            return downloadable;
        }

        public boolean isVirtual() {
            return virtual;
        }

        public String getPermalink() {
            return permalink;
        }

        public String getSku() {
            return sku;
        }

        public String getPrice() {
            return price;
        }

        public String getRegular_price() {
            return regular_price;
        }

        public String getSale_price() {
            return sale_price;
        }

        public String getSale_price_dates_from() {
            return sale_price_dates_from;
        }

        public String getSale_price_dates_to() {
            return sale_price_dates_to;
        }

        public boolean isTaxable() {
            return taxable;
        }

        public String getTax_status() {
            return tax_status;
        }

        public String getTax_class() {
            return tax_class;
        }

        public boolean isManaging_stock() {
            return managing_stock;
        }

        public int getStock_quantity() {
            return stock_quantity;
        }

        public boolean isIn_stock() {
            return in_stock;
        }

        public boolean isBackordered() {
            return backordered;
        }

        public boolean isPurchaseable() {
            return purchaseable;
        }

        public boolean isVisible() {
            return visible;
        }

        public boolean isOn_sale() {
            return on_sale;
        }

        public String getWeight() {
            return weight;
        }

        public List<Dimension> getDimensions() {
            return dimensions;
        }

        public String getShipping_class() {
            return shipping_class;
        }

        public int getShipping_class_id() {
            return shipping_class_id;
        }

        public List<Image> getImage() {
            return image;
        }

        public List<Attribute> getAttributes() {
            return attributes;
        }

        public List<Download> getDownloads() {
            return downloads;
        }

        public int getDownload_limit() {
            return download_limit;
        }

        public int getDownload_expiry() {
            return download_expiry;
        }
    }
}
