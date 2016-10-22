package com.halliburtongmail.j.carl.numberbaseconverter;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private Spinner inputSpin;
    private Spinner outputSpin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        inputSpin = (Spinner) findViewById(R.id.spinInput);
        String arrIn[] = { "Input Base", "Binary", "Decimal", "Octal", "Hexadecimal"};
        ArrayAdapter<String> adapterIn = new ArrayAdapter<>(
                Home.this, R.layout.spinner_item, R.id.textBase,arrIn);
        inputSpin.setAdapter(adapterIn);

        outputSpin = (Spinner) findViewById(R.id.spinOutput);
        String arrOut[] = { "Output Base", "Binary", "Decimal", "Octal", "Hexadecimal"};
        ArrayAdapter<String> adapterOut = new ArrayAdapter<>(
                Home.this, R.layout.spinner_item, R.id.textBase,arrOut);
        outputSpin.setAdapter(adapterOut);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }
}
