package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Map;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        CardView about = (CardView) rootView.findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Fragment prev = getFragmentManager().findFragmentByTag("dialog");
                if (prev != null) {
                    ft.remove(prev);
                }
                ft.addToBackStack(null);
                DialogFragment dialogFragment = new CostumDialog();
                dialogFragment.show(ft, "dialog");
            }
        });


        //gotoProfile
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

        //go to social media All
        CircleImageView telp = (CircleImageView) rootView.findViewById(R.id.linkTelp);
        telp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTelp();
            }

            private void goToTelp() {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:088972991889"));
                startActivity(intent);
            }
        });

        CircleImageView mail = (CircleImageView) rootView.findViewById(R.id.linkMail);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMail();
            }

            private void goToMail() {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:mamanheryantosaja@gmail.com"));
                startActivity(intent);
            }
        });

        CircleImageView fb = (CircleImageView) rootView.findViewById(R.id.linkFb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFb();
            }

            private void goToFb() {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com/arakindonesia"));
                startActivity(browserIntent);
            }
        });

        CircleImageView ig = (CircleImageView) rootView.findViewById(R.id.linkIg);
        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToIg();
            }

            private void goToIg() {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/maman_h"));
                startActivity(browserIntent);
            }
        });

        CircleImageView find = (CircleImageView) rootView.findViewById(R.id.linkFind);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                find();
            }

            private void find() {
                Intent intent = new Intent(getActivity(), MapActivity.class);
                startActivity(intent);
            }
        });






        return rootView;
    }

}
