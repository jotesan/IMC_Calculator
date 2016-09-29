package org.cuatrovientos.android.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button imcCalculator;
    private Button help;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imcCalculator = (Button) findViewById(R.id.imcCalculator);
        help = (Button) findViewById(R.id.help);
        about = (Button) findViewById(R.id.about);

        imcCalculator.setText("IMC Calculator");
        help.setText("Help");
        about.setText("About");

    }

    public void openImcCalc(View view) {
        Intent intent = null;
        intent = new Intent(Menu.this, IMCCalculator.class);
        startActivity(intent);
    }

    public void openHelp(View view) {
        Intent intent = null;
        intent = new Intent(Menu.this, Help.class);
        startActivity(intent);
    }

    public void openAbout(View view) {
        Intent intent = null;
        intent = new Intent(Menu.this, About.class);
        startActivity(intent);
    }
}
