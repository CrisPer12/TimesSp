package com.example.crist.timessp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openCor(View view){
        Intent it = new Intent (this,corin.class);
        startActivity(it);
    }

    public void openPar(View view){
        Intent it = new Intent (this,palmeiras.class);
        startActivity(it);
    }

    public void openSp(View view){
        Intent it = new Intent (this,sp.class);
        startActivity(it);
    }

    public void openSan(View view){
        Intent it = new Intent (this,santos.class);
        startActivity(it);
    }

}
