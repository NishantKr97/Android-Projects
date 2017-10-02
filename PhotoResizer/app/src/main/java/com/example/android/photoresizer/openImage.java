package com.example.android.photoresizer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.net.URI;

import static android.R.attr.data;
import static android.R.attr.path;
//import static com.example.android.photoresizer.MainActivity.REQUEST_IMAGE_GET;
import static com.example.android.photoresizer.R.id.imageView;

public class openImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_image);
        ImageView imageview = (ImageView)findViewById(R.id.imageView);
        Bitmap selectedphoto  =(Bitmap)this.getIntent().getParcelableExtra("data");
        imageview.setImageBitmap(selectedphoto);
        ImageView img= (ImageView) findViewById(R.id.image);
        img.setImageResource(R.drawable.my_image);
    }
    }


