package org.altbeacon.beaconreference;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Global.context=this;
        //getSupportActionBar().hide();

       // Global.db=new Local_Database(Global.context);   // Create Local Database of App

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */

                Intent intent = new Intent(getApplication(), MonitoringActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_out_left, R.anim.push_out_right);
                finish();

            }
        }, SPLASH_DISPLAY_LENGTH);










    }


    @Override
    public void onStart()
    {
        super.onStart();

    }
}
