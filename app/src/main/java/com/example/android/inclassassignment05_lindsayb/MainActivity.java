package com.example.android.inclassassignment05_lindsayb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText nameText;
    private EditText sizeText;
    private CheckBox liveOnPlanet;
    private EditText additionInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = (EditText) findViewById(R.id.planet_name);
        sizeText = (EditText) findViewById(R.id.planet_size);
        liveOnPlanet = (CheckBox) findViewById(R.id.liveOnPlanet);
        additionInfo = (EditText) findViewById(R.id.more_information);
    }

    public void submit (View view)
    {
        String name = nameText.getText().toString();
        String size = sizeText.getText().toString();
        boolean canLive = liveOnPlanet.isChecked();
        String moreInformation = additionInfo.getText().toString();

        Planet planet = new Planet(name, size, canLive, moreInformation);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Keys.PLANET, planet);

        startActivity(intent);
    }
}