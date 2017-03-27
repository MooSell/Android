package com.designwall.moosell.adapter;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.designwall.moosell.R;
import com.designwall.moosell.model.Product.Product;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by scit on 3/21/17.
 */

public class ListProductAdapter extends RecyclerView.Adapter<ListProductAdapter.ViewHolder>{
    private Activity mActivity;
    private List<Product> mProducts;

    public ListProductAdapter(Activity activity, List<Product> products) {
        mActivity = activity;
        mProducts = products;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mActivity).inflate(R.layout.item_product, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Product product = mProducts.get(position);
        holder.name.setText(product.getTitle());
        holder.price.setText("$"+product.getPrice());
        if (!product.getImages().get(0).getSrc().equals("")) {
            Glide.with(mActivity).load(product.getImages().get(0).getSrc())
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(holder.image);
        }else{
            holder.image.setImageDrawable(ContextCompat.getDrawable(mActivity, R.drawable.img_holder));
        }
    }

    @Override
    public int getItemCount() {
        return mProducts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.productImage) ImageView image;
        @BindView(R.id.productName) TextView name;
        @BindView(R.id.productPrice) TextView price;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
