package com.example.android.inclassassignment05_lindsayb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.R.id.message;

public class SecondActivity extends AppCompatActivity {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayText = (TextView) findViewById(R.id.display_text);

        Intent intent = getIntent();

        Planet planet = (Planet) intent.getSerializableExtra(Keys.PLANET);
        displayText.setText(planet.toString());

    }
}