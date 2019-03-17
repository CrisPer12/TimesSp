package com.example.crist.timessp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class corin extends Activity {

    private Button btnHino;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corin);

        btnHino = (Button) findViewById(R.id.hinoCor);

        clickHino();

    }

}
