package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FavoriteMusikRecyclerViewDataAdapter extends RecyclerView.Adapter<FavoriteMusikRecyclerViewItemHolder> {
    private List<FavoriteMusikRecyclerViewItem> FavoriteMusikItemList;

    public FavoriteMusikRecyclerViewDataAdapter(List<FavoriteMusikRecyclerViewItem> FavoriteMusikItemList) {
        this.FavoriteMusikItemList = FavoriteMusikItemList;
    }


    @Override
    public FavoriteMusikRecyclerViewItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Get LayoutInflater object.
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // Inflate the RecyclerView item layout xml.
        View FavoriteMusikItemView = layoutInflater.inflate(R.layout.favmusik, parent, false);

        final TextView FavoriteMusikTitleView = (TextView) FavoriteMusikItemView.findViewById(R.id.card_view_image_title);
        final TextView FavoriteMusikDescView = (TextView) FavoriteMusikItemView.findViewById(R.id.card_view_image_desc);
        final ImageView FavoriteMusikImageView = (ImageView) FavoriteMusikItemView.findViewById(R.id.card_view_image);


        // Create and return our custom Car Recycler View Item Holder object.
        FavoriteMusikRecyclerViewItemHolder ret = new FavoriteMusikRecyclerViewItemHolder(FavoriteMusikItemView);
        return ret;
    }


    @Override
    public void onBindViewHolder(@NonNull FavoriteMusikRecyclerViewItemHolder holder, int position) {
        if (FavoriteMusikItemList != null) {
            // Get car item dto in list.
            FavoriteMusikRecyclerViewItem FavoriteMusikItem = FavoriteMusikItemList.get(position);

            if (FavoriteMusikItemList != null) {
                // Set car item title.
                holder.getFavoriteMusikTitleText().setText(FavoriteMusikItem.getFavoriteMusikName());
                // Set car item desc.
                holder.getFavoriteMusikDescText().setText(FavoriteMusikItem.getFavoriteMusikDesc());
                // Set car image resource id.
                holder.getFavoriteMusikImageView().setImageResource(FavoriteMusikItem.getFavoriteMusikImageId());
            }
        }
    }

    @Override
    public int getItemCount() {
        int ret = 0;
        if (FavoriteMusikItemList != null) {
            ret = FavoriteMusikItemList.size();
        }
        return ret;
    }
}