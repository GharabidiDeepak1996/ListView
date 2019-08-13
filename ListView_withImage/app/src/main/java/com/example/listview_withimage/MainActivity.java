package com.example.listview_withimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
ListView lv;


    public static Integer [] image={
            R.mipmap.cap,R.mipmap.donut,
            R.mipmap.eclair, R.mipmap.froyo,
            R.mipmap.gingerbread, R.mipmap.honeycomb,
            R.mipmap.icecream, R.mipmap.kitkat, R.mipmap.lollipop,
            R.mipmap.marshmallow, R.mipmap.nougat, R.mipmap.oreo, R.mipmap.pie};

    public static String[] name={
            "Cupcake", "Donut", "Eclair",
            "Froyo","Gingerbread"," Still Gingerbread","Honeycomb",
            "Ice Cream Sandwich","Jelly Bean","KitKat","Lollipop","Marshmallow","Nougat ","Oreo "
            , "P"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        Connector cv=new Connector( this,image,name );   //object
        Log.d( TAG, "onCreate: "+cv );
        lv=findViewById( R.id.lv );
        lv.setAdapter( cv );



    }
}
