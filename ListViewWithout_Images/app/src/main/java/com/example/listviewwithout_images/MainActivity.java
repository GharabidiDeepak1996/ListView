package com.example.listviewwithout_images;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        lv=findViewById( R.id.List );

      final  String[] android_names={
                "Cupcake", "Donut", "Eclair",
                "Froyo","Gingerbread"," Still Gingerbread","Honeycomb",
                "Ice Cream Sandwich","Jelly Bean","KitKat","Lollipop","Marshmallow","Nougat ","Oreo "
               , "P"};

        ArrayAdapter<String> aa=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android_names  );
      lv.setAdapter( aa );

      lv.setOnItemClickListener( new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


           // you can use this methos also//  Toast.makeText( getApplicationContext(),"you click on"+android_names[i], Toast.LENGTH_SHORT).show();
              Toast.makeText( MainActivity.this,"you click on"+ android_names[i],Toast.LENGTH_SHORT).show();

          }
      } );
    }
}
