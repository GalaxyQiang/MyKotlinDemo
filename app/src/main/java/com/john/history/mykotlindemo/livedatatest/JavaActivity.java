package com.john.history.mykotlindemo.livedatatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.john.history.mykotlindemo.R;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        TextView textView=findViewById(R.id.javatextView);
        textView.setText("aaaaa");
    }
}
