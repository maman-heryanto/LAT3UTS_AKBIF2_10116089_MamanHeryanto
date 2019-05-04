package com.t.myapp;

/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class GalleryRecylerViewItemHolder extends RecyclerView.ViewHolder  {


    private ImageView GalleryImageView = null;
    public GalleryRecylerViewItemHolder(View itemView) {
        super(itemView);

        if(itemView != null)
        {

            GalleryImageView = (ImageView)itemView.findViewById(R.id.card_view_image);
        }
    }



    public ImageView getGalleryImageView() {
        return GalleryImageView;
    }

}
