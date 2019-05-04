package com.t.myapp;

/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FriendlistFragment extends Fragment {


    public FriendlistFragment() {
        // Required empty public constructor
        RecyclerView recyclerView;
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager mLayoutManager;
    }


    private List<FriendRecyclerViewItem> FriendItemList = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily, container, false);
        initializeDailyItemList();

        Button btndaily =(Button) view.findViewById(R.id.btndaily);
        btndaily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getFriend();

            }

            private void getFriend() {

                Fragment dailFragment = new DailyFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.main_frame, dailFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });



        // Create the recyclerview.
        RecyclerView dailyRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),1, LinearLayout.HORIZONTAL,false);
        // Set layout manager.
        dailyRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        FriendRecyclerViewDataAdapter FriendDataAdapter = new FriendRecyclerViewDataAdapter(FriendItemList);
        // Set data adapter.
        dailyRecyclerView.setAdapter(FriendDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(FriendItemList == null)
        {
            FriendItemList = new ArrayList<FriendRecyclerViewItem>();
            FriendItemList.add(new FriendRecyclerViewItem("Mnifa", R.drawable.image_1));
            FriendItemList.add(new FriendRecyclerViewItem("Maman", R.drawable.image_2));
            FriendItemList.add(new FriendRecyclerViewItem("Jenifer", R.drawable.image_3));
            FriendItemList.add(new FriendRecyclerViewItem("Menarik", R.drawable.image_2));
            FriendItemList.add(new FriendRecyclerViewItem("William", R.drawable.image_1));

        }
    }
}

