package com.t.myapp;

/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */


import android.content.Intent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class DailyFragment extends Fragment {



    public DailyFragment() {
        // Required empty public constructor
        RecyclerView recyclerView;
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager mLayoutManager;
    }

    private List<DailyRecyclerViewItem> DailyItemList = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        

        final View view = inflater.inflate(R.layout.fragment_daily, container, false);
        initializeDailyItemList();


        Button btntest =(Button) view.findViewById(R.id.btntest);
        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFriend();

            }

            private void getFriend() {

                Fragment friendlistFragment = new FriendlistFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.main_frame, friendlistFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



        //Daily
        RecyclerView dailyRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),1);
        dailyRecyclerView.setLayoutManager(gridLayoutManager);
        DailyRecyclerViewDataAdapter DailyDataAdapter = new DailyRecyclerViewDataAdapter(DailyItemList);
        dailyRecyclerView.setAdapter(DailyDataAdapter);


        return view;
    }


    private void initializeDailyItemList() {
        if(DailyItemList == null)
        {
            DailyItemList = new ArrayList<DailyRecyclerViewItem>();

            DailyItemList.add(new DailyRecyclerViewItem("Kuliah", R.drawable.kuliah));
            DailyItemList.add(new DailyRecyclerViewItem("Tidur", R.drawable.tidur));
            DailyItemList.add(new DailyRecyclerViewItem("Belajar\nAndroid Studio", R.drawable.ic_android));
            DailyItemList.add(new DailyRecyclerViewItem("Belajar\nMembuat Web", R.drawable.web));

        }

    }



}
