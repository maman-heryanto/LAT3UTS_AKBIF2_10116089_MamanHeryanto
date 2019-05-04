package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FavoriteMusikRecyclerViewItemHolder extends RecyclerView.ViewHolder {

    private TextView FavoriteMusikTitleText =null;
    private TextView FavoriteMusikDescText =null;
    private ImageView FavoriteMusikImageView = null;

    public FavoriteMusikRecyclerViewItemHolder(View itemView) {
        super(itemView);

        if (itemView != null) {
            FavoriteMusikTitleText = (TextView) itemView.findViewById(R.id.card_view_image_title);
            FavoriteMusikDescText = (TextView) itemView.findViewById(R.id.card_view_image_desc);
            FavoriteMusikImageView = (ImageView) itemView.findViewById(R.id.card_view_image);
        }
    }

    public TextView getFavoriteMusikTitleText() {
        return FavoriteMusikTitleText;
    }

    public TextView getFavoriteMusikDescText() {
        return FavoriteMusikDescText;
    }

    public ImageView getFavoriteMusikImageView() {
        return FavoriteMusikImageView;
    }
}
