package com.example.ujwalyadav;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class cart extends AppCompatActivity {
    ImageView img;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        img=(ImageView) findViewById(R.id.cartimg);
        text=(TextView) findViewById(R.id.carttext);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        text.setText(getIntent().getStringExtra("header"));
    }
}
