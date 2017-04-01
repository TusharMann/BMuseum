package org.altbeacon.beaconreference;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconConsumer;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.RangeNotifier;
import org.altbeacon.beacon.Region;

import java.util.Collection;

public class RangingActivity extends AppCompatActivity implements BeaconConsumer {
    protected static final String TAG = "RangingActivity";
    private BeaconManager beaconManager = BeaconManager.getInstanceForApplication(this);
    FrameLayout frameLayout;
    RadioGroup radio;
    int k1=0,k2=0,k3=0,k4=0;
   // Spinner spinner;
    public static boolean flag=true;



    //Webview
    String url="http://120.63.229.222/npticketing/";
    //Webview view = ()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranging);
        frameLayout=(FrameLayout)findViewById(R.id.framelayout);

        beaconManager.bind(this);
    }

    @Override 
    protected void onDestroy() {
        super.onDestroy();
        beaconManager.unbind(this);
    }

    @Override 
    protected void onPause() {
        super.onPause();
        if (beaconManager.isBound(this)) beaconManager.setBackgroundMode(true);
    }

    @Override 
    protected void onResume() {
        super.onResume();
        if (beaconManager.isBound(this)) beaconManager.setBackgroundMode(false);
    }

    @Override
    public void onBeaconServiceConnect() {

        beaconManager.setRangeNotifier(new RangeNotifier() {
           @Override
           public void didRangeBeaconsInRegion(Collection<Beacon> beacons, Region region) {
              if (beacons.size() > 0) {

                  String current=" ";
                 //EditText editText = (EditText)RangingActivity.this.findViewById(R.id.rangingText);
                 Beacon firstBeacon = beacons.iterator().next();
                  Log.e(TAG,firstBeacon.toString());
                  String x =firstBeacon.getId1().toString();
                  Double d=firstBeacon.getDistance();
                 // x=x.substring(24);
                 Log.e("Ranging","The first beacon " + firstBeacon.getId1().toString() + " is about " + firstBeacon.getDistance() + " meters away.");

                  if(x.equals("00112233-4455-6677-8899-aabbccddeeff") && k1!=1 && d< 5.0)
                  {
                      x = current;
                          monolisa_fragment fragment = new monolisa_fragment();
                          getFragmentManager().beginTransaction().replace(R.id.framelayout, fragment).commit();

                      k2=0;k3=0;k4=0;k1=1;

                  }

                  else if(x.equals("00112233-4455-6677-8899-aabbccddeeee") && k2!=1 && d< 5.0)
                  {
                      Log.e("Sure",x.toString());
                      kohinoor fragment=new kohinoor();
                      getFragmentManager().beginTransaction().replace(R.id.framelayout,fragment).commit();
                      k1=0;k3=0;k4=0;k2=1;

                  }

                  else if(x.equals("00112233-4455-6677-8899-aabbccddeeaa") && k3!=1 && d< 5.0){
                      allanhills fragment =new allanhills();
                      getFragmentManager().beginTransaction().replace(R.id.framelayout,fragment).commit();
                      k1=0;k2=0;k3=1;k4=0;
                  }

              }
           }

        });

        try {
            beaconManager.startRangingBeaconsInRegion(new Region("myRangingUniqueId", null, null, null));
        } catch (RemoteException e) {   }
    }

    private void logToDisplay(final String line) {
        runOnUiThread(new Runnable() {
            public void run() {
                EditText editText = (EditText)RangingActivity.this.findViewById(R.id.rangingText);
                editText.append(line+"\n");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.language) {
            Dialog dialog = onCreateDialogSingleChoice();
            dialog.show();

        }

        else if(id == R.id.pay){
            Payment payment=new Payment();
            getFragmentManager().beginTransaction().replace(R.id.framelayout,payment).commit();

        }

        else if(id == R.id.map){
            Map map=new Map();
            getFragmentManager().beginTransaction().replace(R.id.framelayout,map).commit();

        }

        return super.onOptionsItemSelected(item);
    }

    public Dialog onCreateDialogSingleChoice() {


        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        final CharSequence[] arr={"English","French","German","Hindi"};
        final String item;
       // CharSequence[] array = {“English”, “Medium”, “Low”};

// Set the dialog title
        builder.setTitle("Select Language")
// Specify the list array, the items to be selected by default (null for none),
// and the listener through which to receive callbacks when items are selected
                .setSingleChoiceItems(arr, 0, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
// TODO Auto-generated method stub

                        String selection=" ";
                        switch (which){
                            case 0:
                                selection=(String)arr[which];
                                break;
                            case 1:selection=(String)arr[which];
                                break;
                            case 2:
                                selection=(String)arr[which];
                                break;

                            case 3:
                                selection=(String)arr[which];
                                break;
                            default:break;
                        }
                        Log.e("text",selection);
                        SharedPreferences.Editor editor = getSharedPreferences("select", MODE_PRIVATE).edit();
                    editor.putString("language", selection);
                    editor.commit();

                    }
                })

// Set the action buttons
                .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
// User clicked OK, so save the result somewhere
// or return them to the component that opened the dialog
                        Intent intent=new Intent(getApplication(),RangingActivity.class);
                        startActivity(intent);
                        finish();


                        }

                      //  Toast.makeText(this,selection,Toast.LENGTH_LONG).show();

                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });

        return builder.create();
    }
}
