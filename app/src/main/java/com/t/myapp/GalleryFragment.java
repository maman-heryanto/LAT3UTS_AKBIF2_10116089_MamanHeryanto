package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {


    public GalleryFragment() {
        // Required empty public constructor
        RecyclerView recyclerView;
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager mLayoutManager;
    }

    private List<GalleryRecylerViewItem> GalleryItemList = null;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        initializeGalleryItemList();

        RecyclerView gallRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2,GridLayoutManager.VERTICAL,false);
        gallRecyclerView.setLayoutManager(gridLayoutManager);
        GalleryRecylerViewDataAdapter GalleryDataAdapter = new GalleryRecylerViewDataAdapter(GalleryItemList);
        gallRecyclerView.setAdapter(GalleryDataAdapter);

        return view;
    }

    private void initializeGalleryItemList() {
        if(GalleryItemList == null)
        {
            GalleryItemList = new ArrayList<GalleryRecylerViewItem>();

            GalleryItemList.add(new GalleryRecylerViewItem( R.drawable.image_1));
            GalleryItemList.add(new GalleryRecylerViewItem( R.drawable.image_2));
            GalleryItemList.add(new GalleryRecylerViewItem( R.drawable.image_3));
            GalleryItemList.add(new GalleryRecylerViewItem( R.drawable.image_4));
            GalleryItemList.add(new GalleryRecylerViewItem( R.drawable.image_5));
            GalleryItemList.add(new GalleryRecylerViewItem( R.drawable.image_3));
            GalleryItemList.add(new GalleryRecylerViewItem( R.drawable.image_1));
            GalleryItemList.add(new GalleryRecylerViewItem( R.drawable.image_5));


        }
    }


}
