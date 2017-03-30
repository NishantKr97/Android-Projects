package com.example.android.learnjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.learnjava.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView afterimageView = (ImageView) findViewById(R.id.android_cookie_image_view);
        afterimageView.setImageResource(R.drawable.after_cookie);
        TextView textView= (TextView) findViewById(R.id.status_text_view);
        textView.setText("I'm full");

        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
    public void reset (View view){
        ImageView beforeimageview = (ImageView) findViewById(R.id.android_cookie_image_view);
        beforeimageview.setImageResource(R.drawable.before_cookie);
        TextView textView = (TextView) findViewById(R.id.status_text_view);
        textView.setText("I'm Hungry");
    }
    int n=0;
    public void like (View view){
        String s;
        n++;
        TextView textView = (TextView) findViewById(R.id.like_text_view);
        s="    " + n;
        textView.setText(s);

    }
}