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
import com.designwall.moosell.model.Product.ProductCategory;
import com.designwall.moosell.R;
import com.designwall.moosell.util.RecyclerViewItemClicked;

import java.util.List;

/**
 * Created by SCIT on 3/9/2017.
 */

public class ListCategoryAdapter extends RecyclerView.Adapter<ListCategoryAdapter.ViewHolder> {
    private Activity mActivity;
    private List<ProductCategory> mCategories;
    private RecyclerViewItemClicked mClickListener;

    public ListCategoryAdapter(Activity activity, List<ProductCategory> categories) {
        mActivity = activity;
        mCategories = categories;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mActivity).inflate(R.layout.item_category, parent, false);
        return new ViewHolder(view);
    }

    public void setOnItemClickedListener(RecyclerViewItemClicked clickListener){
        mClickListener = clickListener;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ProductCategory category = mCategories.get(position);
        //
        holder.name.setText(category.getName());
        holder.size.setText(category.getCount()+"");
        if (!category.getImage().equals("")) {
            Glide.with(mActivity).load(category.getImage())
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(holder.background);
        }else{
            holder.background.setImageDrawable(ContextCompat.getDrawable(mActivity, R.drawable.img_holder));
        }
    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView background;
        private TextView name;
        private TextView size;
        public ViewHolder(View itemView) {
            super(itemView);
            background = (ImageView) itemView.findViewById(R.id.categoryBg);
            name = (TextView) itemView.findViewById(R.id.categoryName);
            size = (TextView) itemView.findViewById(R.id.categorySize);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mClickListener.onRecyclerViewItemClicked(getAdapterPosition(), v);
        }
    }
}
