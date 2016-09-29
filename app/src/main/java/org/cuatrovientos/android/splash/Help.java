package org.cuatrovientos.android.splash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Help extends AppCompatActivity {

private TextView helpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        helpText = (TextView) findViewById(R.id.helpText);

        helpText.setText("Help the app, donate");
    }
}
