package com.example.preedaphongr.projecttest.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.preedaphongr.projecttest.R;
import com.example.preedaphongr.projecttest.model.Restaurant;

import java.util.List;

/**
 * Created by preedaphong.r on 13/07/2560.
 */

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {

    List<Restaurant> mValues;
    Context context;
    public SearchAdapter(List<Restaurant> mValues, Context context){
        this.mValues = mValues;
        this.context = context;
    }

    @Override
    public SearchAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_search, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SearchAdapter.ViewHolder holder, int position) {
        holder.mName.setText(mValues.get(position).getRestaurantName());
        Glide.with(context)
                .load("http://www.sushidragonau.com/upload/image/ss_lit.png")
                .into(holder.mImage);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView mName;
        ImageView mImage;
        public ViewHolder(View itemView) {
            super(itemView);
            mName = itemView.findViewById(R.id.foodName_textView);
            mImage = itemView.findViewById(R.id.imageView);
        }
    }
}
