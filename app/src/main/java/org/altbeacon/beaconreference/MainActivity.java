package org.altbeacon.beaconreference;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button playvideo;
    TextView content;
    String key1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView) findViewById(R.id.imageview);
        playvideo=(Button) findViewById(R.id.button);
        content=(TextView)findViewById(R.id.context);

        MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.allan);

        md.start();

    }

}
