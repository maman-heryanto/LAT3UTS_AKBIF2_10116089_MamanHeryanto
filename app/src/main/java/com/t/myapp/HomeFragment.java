package com.t.myapp;

/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    
    public HomeFragment() {
        // Required empty public constructor
   

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home,
                container, false);
        CardView cView = (CardView) rootView.findViewById(R.id.cardView1);
        cView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToSubProfile();


            }

            private void goToSubProfile() {
                Intent intent = new Intent(getActivity(), SubprofileActivity.class);
                startActivity(intent);
            }
        });
        CardView cView2 = (CardView) rootView.findViewById(R.id.cardView2);
        cView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                goToSubInterest();


            }

            private void goToSubInterest() {
                Intent intent = new Intent(getActivity(), SubinterestActivity.class);
                startActivity(intent);
            }
        });
        return rootView;

    }



}
//NIM   : 10116089
//Nama  : Maman Heryanto
//Kelas : AKB-2



