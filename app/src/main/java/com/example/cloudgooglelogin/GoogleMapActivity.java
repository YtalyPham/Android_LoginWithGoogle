package com.example.cloudgooglelogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMapActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_map);

        Fragment fragment= new MapFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();


    }
    //                        //10.778469265452536, 106.69579088412257
//                        map=googleMap;
//                        LatLng HCM=new LatLng(10.778469265452536, 106.69579088412257);
//                        map.addMarker(new MarkerOptions().position(HCM).title("Ho Chi Minh"));
//                        map.moveCamera(CameraUpdateFactory.newLatLng(HCM));



}