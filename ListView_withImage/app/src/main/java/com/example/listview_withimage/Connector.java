package com.example.listview_withimage;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Connector extends ArrayAdapter {
    private static final String TAG = "Connector";

    private  Context context1;
    private Integer[] image1;
    private String[] name1;

    public Connector(Context context,Integer[] Mimage,String[] Mname) {
       super(context,R.layout.textimage,Mimage);
       context1=context;
       image1=Mimage;
       name1=Mname;
        Log.d( TAG, "Connector: "+Mname );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

         LayoutInflater inflater= LayoutInflater.from(context1);
       // LayoutInflater inflater = context.getLayoutInflater();
        View v=inflater.inflate( R.layout.textimage,null,true );
        TextView tv=v.findViewById( R.id.textview );
        ImageView im=v.findViewById( R.id.Imageview );

        tv.setText( name1[position] );
        im.setImageResource( image1[position] );
        return v;
    }
}

