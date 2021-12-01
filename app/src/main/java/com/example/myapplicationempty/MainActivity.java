package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Date;


public class MainActivity extends AppCompatActivity {
    String TAG="acitivity one";
    //TextView textviewnew;
    ListView listViewNew ;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_new);
        //TextView Phone_text= (TextView) findViewById(R.id.Phone);
        //Phone_text.setText("+212 *");
        Log.i(TAG,"---onCreate--");
        //textviewnew =(TextView) findViewById(R.id.textviewexample);
        listViewNew = (ListView) findViewById(R.id.listviewitems);
        adapter = new ArrayAdapter<String>(this,android.R.Layout);
        adapter.add("hello");
        adapter.add("hello");
        adapter.add("hello");
        adapter.add("hello");
        listViewNew.setAdapter(adapter);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"---onStart--");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"---onRestart--");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"---onResume--");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"---onPause--");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"---onStop--");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"---onDestroy--");

    }
    /*public void onClickHandler(View view){
        //Date date = new Date(2019,11,12) ;
        textviewnew.setText("this awesome you just  saw the Toast Message");
        Toast.makeText(this,"You clicked a Button",Toast.LENGTH_LONG).show();
    }*/
}