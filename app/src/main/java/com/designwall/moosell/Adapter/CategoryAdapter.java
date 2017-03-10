package com.designwall.moosell.Adapter;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.designwall.moosell.R;

import java.util.List;

/**
 * Created by SCIT on 3/9/2017.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private Activity mActivity;
    private List<String> mCategories; //TODO: Fix Categories Obj

    public CategoryAdapter(Activity activity, List<String> categories) {
        mActivity = activity;
        mCategories = categories;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mActivity).inflate(R.layout.item_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.background.setImageDrawable(ContextCompat.getDrawable(mActivity, R.drawable.img_holder));
        holder.name.setText(mCategories.get(position));
    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView background;
        private TextView name;
        private TextView size;
        public ViewHolder(View itemView) {
            super(itemView);
            background = (ImageView) itemView.findViewById(R.id.categoryBg);
            name = (TextView) itemView.findViewById(R.id.categoryName);
            size = (TextView) itemView.findViewById(R.id.categorySize);
        }
    }
}
