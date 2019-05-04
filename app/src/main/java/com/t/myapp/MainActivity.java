package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 *
 */

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout          mMainFrame;

    private HomeFragment homeFragment;
    private DailyFragment dailyFragment;
    private FriendlistFragment friendlistFragment;
    private GalleryFragment galleryFragment;
    private FavoriteFragment favoriteFragment;
    private ProfileFragment profileFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.main_nav);

        homeFragment = new HomeFragment();
        dailyFragment = new DailyFragment();
        friendlistFragment = new FriendlistFragment();
        galleryFragment = new GalleryFragment();
        favoriteFragment = new FavoriteFragment();
        profileFragment = new ProfileFragment();

        setFragment(homeFragment);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.nav_home :
                        mMainNav.setItemBackgroundResource(R.color.colorStartBlue);
                        setFragment(homeFragment);
                        return true;

                    case R.id.nav_daily:
                        mMainNav.setItemBackgroundResource(R.color.colorStartBlue);
                        setFragment(dailyFragment);
//                        setFragment(friendlistFragment);
                        return true;
                    case R.id.nav_gallery:
                        mMainNav.setItemBackgroundResource(R.color.colorStartBlue);
                        setFragment(galleryFragment);
                        return true;
                    case R.id.nav_favo:
                        mMainNav.setItemBackgroundResource(R.color.colorStartBlue);
                        setFragment(favoriteFragment);
                        return true;

                    case R.id.nav_prof:
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(profileFragment);
                        return true;

                        default:
                            return false;

                }
            }

            private void setFragment(Fragment fragment) {

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_frame, fragment);
                fragmentTransaction.commit();

            }
        });

    }

    private void setFragment(HomeFragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
}
