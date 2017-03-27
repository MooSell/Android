package com.designwall.moosell.activity.category;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import com.designwall.moosell.adapter.ListCategoryAdapter;
import com.designwall.moosell.config.Constant;
import com.designwall.moosell.model.Product.ProductCategory;
import com.designwall.moosell.activity.cart.CartActivity;
import com.designwall.moosell.activity.listproduct.ListProductActivity;
import com.designwall.moosell.R;
import com.designwall.moosell.util.Helper;
import com.designwall.moosell.util.RecyclerViewItemClicked;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Project      : MooSell
 * Created by   : SCIT
 * On           : 3/10/2017.
 */

public class ListCategoryActivity extends AppCompatActivity implements iViewListCategory,RecyclerViewItemClicked, SwipeRefreshLayout.OnRefreshListener {
    @BindView(R.id.categoriesRecyclerView)  ShimmerRecyclerView mCategoriesRecyclerView;
    @BindView(R.id.swipeRefreshLayout)      SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.toolbar)                 Toolbar mToolbar;

    private ListCategoryAdapter mAdapter;
    private iPresenterListCategory mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);

        mSwipeRefreshLayout.setOnRefreshListener(this);

        mPresenter = new PresenterListCategory(this);
        mPresenter.loadData();
    }

    @Override
    public void setupRecyclerView(List<ProductCategory> categories) {
        mAdapter = new ListCategoryAdapter(this, categories);
        mAdapter.setOnItemClickedListener(this);

        mCategoriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mCategoriesRecyclerView.setHasFixedSize(true);
        mCategoriesRecyclerView.setAdapter(mAdapter);
    }

    @OnClick(R.id.cartBtn)
    public void onCardIconClicked() {
        startActivity(new Intent(this, CartActivity.class));
    }

    @Override
    public void notifyItemRangeInserted(int start, int size) {
        mAdapter.notifyItemRangeInserted(start, size);
    }

    @Override
    public void notifyItemRangeRemoved(int start, int size) {
        mAdapter.notifyItemRangeRemoved(start, size);
    }

    @Override
    public void showRecyclerViewShimmer() {
        mCategoriesRecyclerView.showShimmerAdapter();
    }

    @Override
    public void hideRecyclerViewShimmer() {
        mCategoriesRecyclerView.hideShimmerAdapter();
    }

    @Override
    public void setRefreshing(boolean on) {
        mSwipeRefreshLayout.setRefreshing(on);
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRefresh() {
        mPresenter.refreshData();
    }

    @Override
    public void onRecyclerViewItemClicked(int position, View v) {
        mPresenter.chooseCategory(position);
    }

    @Override
    public void showProductsInCategory(String categoryName, int categoryCount) {
        Intent intent = new Intent(this, ListProductActivity.class);
        intent  .putExtra(Constant.INTENT_CATEGORY_NAME, categoryName)
                .putExtra(Constant.INTENT_CATEGORY_COUNT, categoryCount);
        startActivity(intent);
    }

    @Override
    public void showDialog(String title, String message) {
        Helper.showDialog(this, title, message);
    }
}
