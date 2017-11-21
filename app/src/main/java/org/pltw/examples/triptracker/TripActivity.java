package org.pltw.examples.triptracker;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
/**
 * Created by rcarpenter on 11/16/2017.
 */

public class TripActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the view for the activity to be the xml layout screen that has the FrameLayout that will contain the trip fragment (which in turn uses fragment_trip.xml)
        setContentView(R.layout.activity_trip);

        //check if the trips list fragment already exists - otherwise, create a new one and add it to the fragment container frame found in activity_trip.xml
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.tripFragmentContainer);

        if (fragment==null) {
            fragment = new TripFragment();
            manager.beginTransaction()
                    .add(R.id.tripFragmentContainer, fragment)
                    .commit();
        }
    }
}

