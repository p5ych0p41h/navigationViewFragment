package com.example.navigationviewfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonActivity = findViewById(R.id.buttonActivity);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SpinActivity.class);
                startActivity(intent);
            }
        };

        buttonActivity.setOnClickListener(listener);
    }
}