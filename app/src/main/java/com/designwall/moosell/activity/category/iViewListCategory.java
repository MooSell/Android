package com.designwall.moosell.activity.category;

import com.designwall.moosell.model.Product.ProductCategory;

import java.util.List;

/**
 * Created by SCIT on 3/10/2017.
 */

public interface iViewListCategory {

    void setupRecyclerView(List<ProductCategory> categories);

    void notifyItemRangeInserted(int start, int size);

    void notifyItemRangeRemoved(int start, int size);

    void showRecyclerViewShimmer();

    void hideRecyclerViewShimmer();

    void setRefreshing(boolean on);

    void showToast(String text);

    void showProductsInCategory(String categoryName, int categoryCount);

    void showDialog(String title, String message);
}
