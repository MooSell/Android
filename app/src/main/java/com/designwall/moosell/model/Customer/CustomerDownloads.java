package com.designwall.moosell.model.Customer;

import java.util.List;

/**
 * Created by SCIT on 3/10/2017.
 */

public class CustomerDownloads {
    private String download_url;
    private String download_id;
    private int product_id;
    private String download_name;
    private int order_id;
    private String order_key;
    private String downloads_remaining;
    private String access_expires;
    private List<String> file;

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getDownload_id() {
        return download_id;
    }

    public void setDownload_id(String download_id) {
        this.download_id = download_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getDownload_name() {
        return download_name;
    }

    public void setDownload_name(String download_name) {
        this.download_name = download_name;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_key() {
        return order_key;
    }

    public void setOrder_key(String order_key) {
        this.order_key = order_key;
    }

    public String getDownloads_remaining() {
        return downloads_remaining;
    }

    public void setDownloads_remaining(String downloads_remaining) {
        this.downloads_remaining = downloads_remaining;
    }

    public String getAccess_expires() {
        return access_expires;
    }

    public void setAccess_expires(String access_expires) {
        this.access_expires = access_expires;
    }

    public List<String> getFile() {
        return file;
    }

    public void setFile(List<String> file) {
        this.file = file;
    }
}
