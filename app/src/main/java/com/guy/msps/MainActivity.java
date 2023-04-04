package com.guy.msps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MSP.get().putString("Name", "Guy");

        String name = MSP.get().getString("Name", "");

        Toast.makeText(this, name, Toast.LENGTH_LONG).show();
    }
}