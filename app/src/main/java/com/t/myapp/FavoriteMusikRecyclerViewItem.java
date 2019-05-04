package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */

public class FavoriteMusikRecyclerViewItem {


    // Save car name.
    private String FavoriteMusikName;

    // Save car name.
    private String FavoriteMusikDesc;

    // Save car image resource id.
    private int FavoriteMusikImageId;

    public FavoriteMusikRecyclerViewItem(String FavoriteMusikName, String FavoriteMusikDesc, int FavoriteMusikImageId) {
        this.FavoriteMusikName = FavoriteMusikName;
        this.FavoriteMusikDesc = FavoriteMusikDesc;
        this.FavoriteMusikImageId = FavoriteMusikImageId;
    }

    public String getFavoriteMusikName() {
        return FavoriteMusikName;
    }

    public void setFavoriteMusikName(String FavoriteMusikName) {
        this.FavoriteMusikName = FavoriteMusikName;
    }

    public String getFavoriteMusikDesc() {
        return FavoriteMusikDesc;
    }

    public void setFavoriteMusikDesc(String FavoriteMusikDesc) {
        this.FavoriteMusikDesc = FavoriteMusikDesc;
    }

    public int getFavoriteMusikImageId() {
        return FavoriteMusikImageId;
    }

    public void setFavoriteMusikImageId(int FavoriteMusikImageId) {
        this.FavoriteMusikImageId = FavoriteMusikImageId;
    }

}
