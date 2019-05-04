package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteFragment extends Fragment {


    public FavoriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_favorite, container, false);

        Button btnmusik =(Button) view.findViewById(R.id.btnmusik);
        btnmusik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getMusikFav();

            }

            private void getMusikFav() {

                Fragment favoriteMusikFragment = new FavoriteMusikFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.main_frame, favoriteMusikFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        //video
        Button btnvideo =(Button) view.findViewById(R.id.btnvideo);
        btnvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getMusikFav();

            }

            private void getMusikFav() {

                Fragment videoFragment = new VideoFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.main_frame, videoFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return view;
    }



}
