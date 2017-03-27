package com.designwall.moosell.activity.listproduct;

import com.designwall.moosell.model.Product.Product;
import com.designwall.moosell.model.Product.ProductCategory;

import java.util.List;

/**
 * Created by phams on 3/15/2017.
 */

public interface iViewListProduct{
    void setupRecyclerView(List<Product> products);

    void showMessage(String msg);

    void notifyItemRangeInserted(int start, int size);
    void notifyItemRangeRemoved(int start, int size);

    void showLoadingView(boolean on);
}
