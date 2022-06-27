package com.example.ujwalyadav;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder
{
    ImageView img;
    TextView text;
    Button btn;
    public myviewholder(@NonNull View itemView)
    {
        super(itemView);
        img=(ImageView)itemView.findViewById(R.id.img1);
        text=(TextView)itemView.findViewById(R.id.text);
        btn=(Button) itemView.findViewById(R.id.btn);
    }
}

