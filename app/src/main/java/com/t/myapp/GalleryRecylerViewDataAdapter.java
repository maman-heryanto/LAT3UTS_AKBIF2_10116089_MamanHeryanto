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

import java.util.List;

public class GalleryRecylerViewDataAdapter extends RecyclerView.Adapter<GalleryRecylerViewItemHolder> {

    private List<GalleryRecylerViewItem> GalleryItemList;

    public GalleryRecylerViewDataAdapter(List<GalleryRecylerViewItem> GalleryItemList) {
        this.GalleryItemList = GalleryItemList;
    }


    @Override
    public GalleryRecylerViewItemHolder onCreateViewHolder(ViewGroup parent, int viewType){
        // Get LayoutInflater object.
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // Inflate the RecyclerView item layout xml.
        View GalleryItemView = layoutInflater.inflate(R.layout.galleryimagelist, parent, false);

        // Get car image view object.
        final ImageView GalleryImageView = (ImageView)GalleryItemView.findViewById(R.id.card_view_image);
        // When click the image.


        // Create and return our custom Car Recycler View Item Holder object.
        GalleryRecylerViewItemHolder ret = new GalleryRecylerViewItemHolder(GalleryItemView);
        return ret;
    }


    @Override
    public void onBindViewHolder(@NonNull GalleryRecylerViewItemHolder holder, int position) {
        if (GalleryItemList != null) {
            // Get car item dto in list.
            GalleryRecylerViewItem dailyItem = GalleryItemList.get(position);

            if (dailyItem != null) {
                // Set car image resource id.
                holder.getGalleryImageView().setImageResource(dailyItem.getGalleryImageId());
            }
        }
    }

    @Override
    public int getItemCount() {
        int ret = 0;
        if(GalleryItemList!=null)
        {
            ret = GalleryItemList.size();
        }
        return ret;
    }
}