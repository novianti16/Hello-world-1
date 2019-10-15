package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int skorA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambah3poinA(View view) {
        skorA = skorA + 3;
        TextView textViewA = findViewById(R.id.skorA);
        textViewA.setText (String.valueOf(skorA));
    }
}
