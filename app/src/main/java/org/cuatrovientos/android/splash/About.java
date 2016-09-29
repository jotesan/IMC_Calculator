package org.cuatrovientos.android.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {

    private TextView aboutText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutText = (TextView) findViewById(R.id.aboutText);

        aboutText.setText("IMC Calculator v1.0 by Joseba (C) September 2016");
    }
}
