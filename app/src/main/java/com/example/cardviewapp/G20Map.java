package com.example.cardviewapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class G20Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g20_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);

        LatLng dc = new LatLng(39.91, -77.02);
        mMap.addMarker(new MarkerOptions().position(dc).title("Marker in Washington DC"));
        LatLng beijing = new LatLng(39.55, 116.20);
        mMap.addMarker(new MarkerOptions().position(beijing).title("Marker in Beijing"));
        LatLng tokyo = new LatLng(35.69, 139.69);
        mMap.addMarker(new MarkerOptions().position(tokyo).title("Marker in Tokyo"));
        LatLng berlin = new LatLng(52.30, 13.25);
        mMap.addMarker(new MarkerOptions().position(berlin).title("Marker in Berlin"));
        LatLng paris = new LatLng(48.50, 2.20);
        mMap.addMarker(new MarkerOptions().position(paris).title("Marker in Paris"));
        LatLng london = new LatLng(51.36, -00.05);
        mMap.addMarker(new MarkerOptions().position(london).title("Marker in London"));
        LatLng delhi = new LatLng(28.37, 77.13);
        mMap.addMarker(new MarkerOptions().position(delhi).title("Marker in New Delhi"));
        LatLng brasilia = new LatLng(-15.47, -47.55);
        mMap.addMarker(new MarkerOptions().position(brasilia).title("Marker in Brasilia"));
        LatLng rome = new LatLng(41.54, 12.29);
        mMap.addMarker(new MarkerOptions().position(rome).title("Marker in Rome"));
        LatLng ottawa = new LatLng(45.27, -75.42);
        mMap.addMarker(new MarkerOptions().position(ottawa).title("Marker in Ottawa"));
        LatLng seoul = new LatLng(37.31, 126.58);
        mMap.addMarker(new MarkerOptions().position(seoul).title("Marker in Seoul"));
        LatLng moscow = new LatLng(55.45, 37.35);
        mMap.addMarker(new MarkerOptions().position(moscow).title("Marker in Moscow"));
        LatLng canberra = new LatLng(-35.15, 149.08);
        mMap.addMarker(new MarkerOptions().position(canberra).title("Marker in Canberra"));
        LatLng madrid = new LatLng(40.25, -03.45);
        mMap.addMarker(new MarkerOptions().position(madrid).title("Marker in Madrid"));
        LatLng mcity = new LatLng(19.20, -99.10);
        mMap.addMarker(new MarkerOptions().position(mcity).title("Marker in Mexico City"));
        LatLng jakarta = new LatLng(-06.09, 106.49);
        mMap.addMarker(new MarkerOptions().position(jakarta).title("Marker in Jakarta"));
        LatLng ankara = new LatLng(39.57, 32.54);
        mMap.addMarker(new MarkerOptions().position(ankara).title("Marker in Ankara"));
        LatLng amsterdam = new LatLng(52.23, 04.54);
        mMap.addMarker(new MarkerOptions().position(amsterdam).title("Marker in Amsterdam"));
        LatLng bern = new LatLng(46.57, 07.28);
        mMap.addMarker(new MarkerOptions().position(bern).title("Marker in Bern"));
        LatLng riyadh = new LatLng(24.41, 46.42);
        mMap.addMarker(new MarkerOptions().position(riyadh).title("Marker in Riyadh"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(dc));
    }
}
