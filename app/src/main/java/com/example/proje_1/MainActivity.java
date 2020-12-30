package com.example.proje_1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void change_image (View view) {

        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
                imageView.setImageResource(R.drawable.image3);
    }
}
