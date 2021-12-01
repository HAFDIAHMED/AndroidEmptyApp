package com.example.myapplicationempty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG="acitivity one";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout_new);
        //TextView Phone_text= (TextView) findViewById(R.id.Phone);
        //Phone_text.setText("+212 *");
        Log.i(TAG,"---onCreate--");

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
    public void onClickHandler(View view){
        Toast.makeText(this,"You clicked a Button",Toast.LENGTH_LONG).show();
    }
}