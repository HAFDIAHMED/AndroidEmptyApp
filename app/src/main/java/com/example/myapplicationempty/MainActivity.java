package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Date;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String TAG="acitivity one";
    //TextView textviewnew;
    ListView listViewNew ;
    ArrayAdapter<String> adapter;
    //ArrayAdapter<Button> AdapterButtons;
    //Button buttonNavigate= (Button) findViewById(R.id.navigate_with_button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button buttonNavigate= (Button) findViewById(R.id.navigate_with_button);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView Phone_text= (TextView) findViewById(R.id.Phone);
        //Phone_text.setText("+212 *");
        Log.i(TAG,"---onCreate--");
        //textviewnew =(TextView) findViewById(R.id.textviewexample);
        /*listViewNew = (ListView) findViewById(R.id.listviewitems);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.add("hello");
        adapter.add("hello");
        adapter.add("hello");
        adapter.add("hello");
        listViewNew.setAdapter(adapter);
        //AdapterButtons= new ArrayAdapter<Button>(this,android.R.layout.si)
        listViewNew.setOnItemClickListener(this);*/
        buttonNavigate.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  Intent intent2= new 
                                              }
                                          }

        );


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

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String itemclick=adapter.getItem(i);
        Toast.makeText(this,"You cliken on item "+itemclick,Toast.LENGTH_LONG).show();
        //navigate to an other activity
        Intent intent = new Intent (MainActivity.this,aciticityOne.class);
        startActivity(intent);
    }
    /*public void onClickHandler(View view){
        //Date date = new Date(2019,11,12) ;
        textviewnew.setText("this awesome you just  saw the Toast Message");
        Toast.makeText(this,"You clicked a Button",Toast.LENGTH_LONG).show();
    }*/
}