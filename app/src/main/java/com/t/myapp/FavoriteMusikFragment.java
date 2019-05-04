package com.t.myapp;

/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class FavoriteMusikFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;



    private List<FavoriteMusikRecyclerViewItem> FavoriteMusikItemList = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite_musik, container, false);
        initializeFavoriteMusikItemList();

        // Create the recyclerview.
        RecyclerView favoritemusikRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),1);
        // Set layout manager.
        favoritemusikRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        FavoriteMusikRecyclerViewDataAdapter FavoriteMusikDataAdapter = new FavoriteMusikRecyclerViewDataAdapter(FavoriteMusikItemList);
        // Set data adapter.
        favoritemusikRecyclerView.setAdapter(FavoriteMusikDataAdapter);

        return view;
    }

    private void initializeFavoriteMusikItemList() {

        if(FavoriteMusikItemList == null)
        {
            FavoriteMusikItemList = new ArrayList<FavoriteMusikRecyclerViewItem>();
            FavoriteMusikItemList.add(new FavoriteMusikRecyclerViewItem("Red Hot Chili Peppers","Soul To Squeeze", R.drawable.band1));
            FavoriteMusikItemList.add(new FavoriteMusikRecyclerViewItem("Bring Me The Horizon","Shadow Moses", R.drawable.band2));
            FavoriteMusikItemList.add(new FavoriteMusikRecyclerViewItem("Stoner Rock","Psychedelic & Stoner Rock", R.drawable.band3));
            FavoriteMusikItemList.add(new FavoriteMusikRecyclerViewItem("Jangar","Konstan", R.drawable.band4));
            FavoriteMusikItemList.add(new FavoriteMusikRecyclerViewItem("Kangen-Band","Sasuke~", R.drawable.band5));

        }
    }


}
