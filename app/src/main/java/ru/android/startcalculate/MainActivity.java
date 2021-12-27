package ru.android.startcalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton startCalculator = findViewById(R.id.launch_calc);

        startCalculator.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String uri = "ru.android.lesson2";
//        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        Intent intent = new Intent();
        intent.setClassName(uri,uri+".MainActivity");
        startActivity(intent);
    }
}