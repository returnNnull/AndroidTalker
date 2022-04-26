package com.bam.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView _textView = findViewById(R.id.textView);
        ImageView _imageView = findViewById(R.id.imageView2);
        String[] _strings = getResources().getStringArray(R.array.android_talker);
        Random _random = new Random();

        _imageView.setOnClickListener(v -> {
            int index =_random.nextInt(90);
            _textView.setText(_strings[index%3]);
        });
    }
}