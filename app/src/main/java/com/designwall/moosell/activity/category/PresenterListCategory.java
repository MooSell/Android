package com.designwall.moosell.activity.category;

import com.designwall.moosell.task.GetDataTask;
import com.designwall.moosell.model.Product.ProductCategory;
import com.designwall.moosell.util.Helper;
import com.designwall.moosell.util.Network;
import com.designwall.moosell.config.Url;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Project      : MooSell
 * Created by   : SCIT
 * On           : 3/10/2017.
 */

public class PresenterListCategory implements iPresenterListCategory {
    private Gson mGson;
    private List<ProductCategory> mCategories;
    private ListCategoryActivity mView;

    public PresenterListCategory(ListCategoryActivity view) {
        mGson        = new Gson();
        mCategories  = new ArrayList<>();
        mView        = view;
        mView.setupRecyclerView(mCategories);
    }

    @Override
    public void refreshData() {
        mCategories.clear();
        mView.notifyItemRangeRemoved(0, 0);
        loadData();
    }

    @Override
    public void chooseCategory(int position) {
        ProductCategory category = mCategories.get(position);
        mView.showProductsInCategory(category.getName(), category.getCount());
    }

    @Override
    public void loadData() {
        if (Network.isAvailable(mView)){
            new GetDataTask(GetDataTask.METHOD_GET){

                @Override
                protected void onPreExecute() {
                    super.onPreExecute();
                    mView.showRecyclerViewShimmer();
                }

                @Override
                protected void onPostExecute(String[] result) {
                    super.onPostExecute(result);

                    JsonElement jsonCategories = new JsonParser().parse(result[0]).getAsJsonObject().get("product_categories");

                    mCategories.addAll((List<ProductCategory>) mGson.fromJson(jsonCategories, new TypeToken<List<ProductCategory>>(){}.getType()));
                    mView.notifyItemRangeInserted(0, mCategories.size());

                    mView.setRefreshing(false);
                    mView.hideRecyclerViewShimmer();
                }

            }.execute(Url.getProductCategories());
        }else{
            mView.setRefreshing(false);
            mView.showDialog("Error!!", "No internet connection!");
        }
    }
}
