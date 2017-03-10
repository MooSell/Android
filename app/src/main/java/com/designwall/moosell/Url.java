package com.designwall.moosell;

/**
 * Created by SCIT on 3/9/2017.
 */

public class Url {
    private static final String API_VER = "wc-api/v3";
    private static final String URL = Config.HOST + "/" + API_VER;

    private static final String API_COUPON      = "coupons";
    public static final String API_CUSTOMERS    = "customers";
    public static final String API_EMAIL        = "email";
    public static final String API_ORDERS       = "orders";
    public static final String API_DOWNLOAD     = "downloads";
    public static final String API_ORDER_STATUSES = "statuses";
    public static final String API_NOTES        = "notes";
    public static final String API_REFUNDS      = "refunds";
    public static final String API_PRODUCTS     = "products";
    public static final String API_REVIEWS      = "reviews";
    public static final String API_ATTRIBUTES   = "attributes";
    public static final String API_CATEGORIES   = "categories";
    public static final String API_SHIPPING_CLASSES = "shipping_classes";
    public static final String API_TAGS = "tags";
    public static final String API_TAXES = "taxes";

    private static final String API_BULK = "bulk";
    private static final String API_COUNT = "count";
    private static final String API_TERMS = "terms";

    public static String getCounpons(){
        return URL +"/"+ API_COUPON;
    }

    public static String getCounponsCount(){
        return getCounpons() + "/" + API_COUNT;
    }

    public static String getCounponsId(int id){
        return getCounpons() + "/" + id;
    }

    public static String getCounponsBulk(){
        return getCounpons() + "/" + API_BULK;
    }

    public static String getCustomers(){
        return URL +"/"+ API_CUSTOMERS;
    }

    public static String getCustomerId(int customerId){
        return getCustomers() +"/"+ customerId;
    }

    public static String getCustomerEmail(String email){
        return getCustomers() +"/"+ API_EMAIL + "/" + email;
    }

    public static String getCustomersBulk(){
        return getCustomers() + "/" + API_BULK;
    }

    public static String getCustomerOrders(int customerId){
        return getCustomers() +"/"+ customerId + "/" + API_ORDERS;
    }

    public static String getCustomerDownloads(int customerId){
        return getCustomerId(customerId) + "/" + API_DOWNLOAD;
    }

    public static String getCustomersCount(){
        return getCustomers() + "/" + API_COUNT;
    }

    public static String getOrders(){
        return URL +"/"+ API_ORDERS;
    }

    public static String getOrdersCount(){
        return getOrders() + "/" + API_COUNT;
    }

    public static String getOrderId(int orderId){
        return getOrders() +"/"+ orderId;
    }

    public static String getOrdersBulk(){
        return getOrders() + "/" + API_BULK;
    }

    public static String getOrdersStatuses(){
        return getOrders() + "/" + API_ORDER_STATUSES;
    }

    public static String getOrderNote(int orderId){
        return getOrderId(orderId) + "/" + API_NOTES;
    }

    public static String getOrderNote(int orderId, int noteId){
        return getOrderNote(orderId) + "/" + noteId;
    }

    public static String getOrderRefundId(int orderId){
        return getOrderId(orderId) + "/" + API_REFUNDS;
    }

    public static String getOrderRefundId(int orderId, int refundId){
        return getOrderRefundId(orderId) + "/" + refundId;
    }

    public static String getProducts(){
        return URL + "/" + API_PRODUCTS;
    }

    public static String getProductId(int productId){
        return getProducts() + "/" + productId;
    }

    public static String getProductsBulk(){
        return getProducts() + "/" + API_BULK;
    }

    public static String getProductsCount(){
        return getProducts() + "/" + API_COUNT;
    }

    public static String getProductOrders(int productId){
        return getProductId(productId) + "/" + API_ORDERS;
    }

    public static String getProductReviews(int productId){
        return getProductId(productId) + "/" + API_REVIEWS;
    }

    public static String getProductAttributes(){
        return getProducts() + "/" + API_ATTRIBUTES;
    }

    public static String getProductAttributesId(int attId){
        return getProductAttributes() + "/" + attId;
    }

    public static String getProductAttributeTerms(int attId){
        return getProductAttributesId(attId) + "/" + API_TERMS;
    }

    public static String getProductAttributeTerm(int attId, int termId){
        return getProductAttributeTerms(attId) + "/" + termId;
    }

    public static String getProductCategories(){
        return getProducts() + "/" + API_CATEGORIES;
    }

    public static String getProductCategory(int categoryId){
        return getProductCategories() + "/" + categoryId;
    }

    public static String getProductShippingClasses(){
        return getProducts() + "/" + API_SHIPPING_CLASSES;
    }

    public static String getProductShippingClass(int classId){
        return getProductShippingClasses() + "/" + classId;
    }

    public static String getProductTags(){
        return getProducts() + "/" + API_TAGS;
    }

    public static String getProductTag(int tagId){
        return getProductTags() + "/" + tagId;
    }

    public static String getTaxes(){
        return URL + "/" + API_TAXES;
    }

    public static String getTax(int taxId){
        return getTaxes() + "/" + taxId;
    }

    public static String getTaxBulk(){
        return getTaxes() + "/" + API_BULK;
    }

    public static String getTaxesCount(){
        return getTaxes() + "/" + API_COUNT;
    }

}
