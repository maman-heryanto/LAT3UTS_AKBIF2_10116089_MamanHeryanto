package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 */
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class SubprofileActivity extends AppCompatActivity {

    private CircleImageView telp;
    private CircleImageView fb;
    private CircleImageView ig;
    private ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subprofile);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        CircleImageView telp = (CircleImageView) findViewById(R.id.linkTelp);
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

        CircleImageView fb = (CircleImageView) findViewById(R.id.linkFb);
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

        CircleImageView ig = (CircleImageView) findViewById(R.id.linkIg);
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

        ImageView back = (ImageView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBack();
            }

            private void goToBack() {
                Intent intent = new Intent(SubprofileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
