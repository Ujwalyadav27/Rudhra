package com.example.ujwalyadav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myaadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Nestle Products");

        rcv = (RecyclerView) findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myaadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("Kit Kat");
        ob1.setBtn(R.id.btn);
        ob1.setImgname(R.drawable.kitkatnestle);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("MILO");
        ob2.setBtn(R.id.btn);
        ob2.setImgname(R.drawable.milonestle);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("Maggi");
        ob3.setBtn(R.id.btn);
        ob3.setImgname(R.drawable.maggienestle);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("DIBS");
        ob4.setBtn(R.id.btn);
        ob4.setImgname(R.drawable.dibsnestle);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("NIDO");
        ob5.setBtn(R.id.btn);
        ob5.setImgname(R.drawable.nidonestle);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("Crunch");
        ob6.setBtn(R.id.btn);
        ob6.setImgname(R.drawable.crunchnestle);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("CofeeMate");
        ob7.setBtn(R.id.btn);
        ob7.setImgname(R.drawable.cofeematenestle);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("NAN");
        ob8.setBtn(R.id.btn);
        ob8.setImgname(R.drawable.nannestle);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("MilkBar");
        ob9.setBtn(R.id.btn);
        ob9.setImgname(R.drawable.milkbar);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("Boost");
        ob10.setBtn(R.id.btn);
        ob10.setImgname(R.drawable.boostnestle);
        holder.add(ob10);

        return holder;
    }


}


