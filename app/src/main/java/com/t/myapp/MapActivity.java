package com.t.myapp;
/**
 * NIM   : 10116089
 * Nama  : Maman Heryanto
 * Kelas : AKB-2
 *
 */
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
//    FragmentActivity implements OnMapReadyCallback
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        //fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        SupportMapFragment mapFragment =(SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
//
    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;
        float zoomLevel = 16.0f; //This goes up to 21

        LatLng Mapme = new LatLng(-6.888710, 107.619857);
        map.addMarker(new MarkerOptions().position(Mapme).title("Di Sekeloa\nSaya Kos"));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Mapme, zoomLevel));
        map.moveCamera(CameraUpdateFactory.newLatLng(Mapme));
    }
}

