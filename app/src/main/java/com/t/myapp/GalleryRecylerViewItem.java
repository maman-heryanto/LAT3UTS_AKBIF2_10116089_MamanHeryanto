package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */

public class GalleryRecylerViewItem {



    // Save car image resource id.
    private int GalleryImageId;

    public GalleryRecylerViewItem(int GalleryImageId) {

        this.GalleryImageId = GalleryImageId;
    }


    public int getGalleryImageId() {
        return GalleryImageId;
    }

    public void setGalleryImageId(int GalleryImageId) {
        this.GalleryImageId = GalleryImageId;
    }
}
