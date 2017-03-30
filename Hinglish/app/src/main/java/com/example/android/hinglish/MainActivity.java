
package com.example.android.hinglish;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.android.hinglish.R;

import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }
    public void open_another_activity1(View view){
        Intent i = new Intent(this,Numbers.class);
        startActivity(i);
        Toast.makeText(view.getContext(),"Numbers",Toast.LENGTH_SHORT).show();
    }
    public void open_another_activity2(View view){
        Intent i = new Intent(this,Family.class);
        startActivity(i);
        Toast.makeText(view.getContext(),"Family",Toast.LENGTH_SHORT).show();
    }
    public void open_another_activity3(View view){
        Intent i = new Intent(this,Colors.class);
        startActivity(i);
        Toast.makeText(view.getContext(),"Colors",Toast.LENGTH_SHORT).show();
    }
    public void open_another_activity4(View view){
        Intent i = new Intent(this,Phrases.class);
        startActivity(i);
        Toast.makeText(view.getContext(),"Phrases",Toast.LENGTH_SHORT).show();
    }
}
