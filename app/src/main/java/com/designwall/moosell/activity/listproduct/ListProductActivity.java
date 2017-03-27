package com.designwall.moosell.activity.listproduct;

import android.content.res.Configuration;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.cooltechworks.views.shimmer.ShimmerRecyclerView;
import com.designwall.moosell.adapter.ListProductAdapter;
import com.designwall.moosell.config.Constant;
import com.designwall.moosell.R;
import com.designwall.moosell.model.Product.Product;
import com.designwall.moosell.util.ItemOffsetDecoration;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;



public class ListProductActivity extends AppCompatActivity implements iViewListProduct, SwipeRefreshLayout.OnRefreshListener{
    @BindView(R.id.recyclerView) ShimmerRecyclerView mRecyclerView;
    @BindView(R.id.swipeRefreshLayout) SwipeRefreshLayout mSwipeRefreshLayout;
    @BindView(R.id.loadingView) View mLoadingView;

    private iPresenterListProduct mPresenter;
    private ListProductAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);
        ButterKnife.bind(this);

        mPresenter = new PresenterListProduct(this);
        mPresenter.saveReceivedCategory(
                getIntent().getStringExtra(Constant.INTENT_CATEGORY_NAME),
                getIntent().getIntExtra(Constant.INTENT_CATEGORY_COUNT, 0)
        );

        //Load first products page
        mPresenter.loadPage(0);
    }

    @Override
    public void onRefresh() {
        mPresenter.refreshData();
    }

    @Override
    public void setupRecyclerView(List<Product> products) {
        int col = 4;
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            col = 2;
        }

        mAdapter = new ListProductAdapter(this, products);
        final GridLayoutManager layoutManager = new GridLayoutManager(this, col);

        mRecyclerView.addItemDecoration(new ItemOffsetDecoration(this, R.dimen.item_offset));
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == android.view.MotionEvent.ACTION_UP) {
                    if (layoutManager.findLastCompletelyVisibleItemPosition() == mAdapter.getItemCount() -1 ) {
                        showLoadingView(true);
                        mPresenter.loadNextPage();
                    }
                }
                return false;
            }
        });
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void notifyItemRangeInserted(int start, int size) {
        Log.v("Start", start+"");
        Log.v("Size", size+"");
        mAdapter.notifyItemRangeInserted(start, size);
    }

    @Override
    public void notifyItemRangeRemoved(int start, int size) {
        mAdapter.notifyItemRangeRemoved(start, size);
    }

    @Override
    public void showLoadingView(boolean on) {
        if (on) {
            mLoadingView.setVisibility(View.VISIBLE);
        }else{
            mLoadingView.setVisibility(View.GONE);
        }
    }
}
