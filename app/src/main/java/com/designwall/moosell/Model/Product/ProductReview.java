package com.designwall.moosell.Model.Product;

/**
 * Created by SCIT on 3/10/2017.
 */

public class ProductReview {
    private int id;
    private String created_at;
    private String rating;
    private String reviewer_name;
    private String reviewer_email;
    private boolean verified;

    public ProductReview(int id, String created_at, String rating, String reviewer_name, String reviewer_email, boolean verified) {
        this.id = id;
        this.created_at = created_at;
        this.rating = rating;
        this.reviewer_name = reviewer_name;
        this.reviewer_email = reviewer_email;
        this.verified = verified;
    }

    public int getId() {
        return id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getRating() {
        return rating;
    }

    public String getReviewer_name() {
        return reviewer_name;
    }

    public String getReviewer_email() {
        return reviewer_email;
    }

    public boolean isVerified() {
        return verified;
    }
}
