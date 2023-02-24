package sn.ipsl.all;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Localisation extends AppCompatActivity implements LocationListener {
    private Button getLocationBtn;
    private TextView longitudeView,latitudeView;
    LocationManager locationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localisation);

        getLocationBtn = (Button)findViewById(R.id.getLocationBtn);
        longitudeView = (TextView)findViewById(R.id.longitudeView);
        latitudeView = (TextView)findViewById(R.id.latitudeView);

        getLocationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getLocation();
            }
        });
    }

    void getLocation() {
        try {
            locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 5, this);
        }
        catch(SecurityException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onLocationChanged(Location location) {
        latitudeView.setText(" Latitude: " + location.getLatitude() );
        longitudeView.setText(" Longitude: " + location.getLongitude());
    }

    @Override
    public void onProviderDisabled(String provider) {
        Toast.makeText(Localisation.this, "Veuillez activer le GPS et vous connecter à Internet", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }
}