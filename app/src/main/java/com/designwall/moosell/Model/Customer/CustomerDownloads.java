package com.designwall.moosell.Model.Customer;

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

    public CustomerDownloads(String download_url, String download_id, int product_id, String download_name, int order_id, String order_key, String downloads_remaining, String access_expires, List<String> file) {
        this.download_url = download_url;
        this.download_id = download_id;
        this.product_id = product_id;
        this.download_name = download_name;
        this.order_id = order_id;
        this.order_key = order_key;
        this.downloads_remaining = downloads_remaining;
        this.access_expires = access_expires;
        this.file = file;
    }

    public String getDownload_url() {
        return download_url;
    }

    public String getDownload_id() {
        return download_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getDownload_name() {
        return download_name;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getOrder_key() {
        return order_key;
    }

    public String getDownloads_remaining() {
        return downloads_remaining;
    }

    public String getAccess_expires() {
        return access_expires;
    }

    public List<String> getFile() {
        return file;
    }
}
