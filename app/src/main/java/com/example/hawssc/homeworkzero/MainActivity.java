package com.example.hawssc.homeworkzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

        private static final String MESSAGE = "debugmessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(MESSAGE, "The onCreate method was called");
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MESSAGE, "The onResume method was called");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MESSAGE, "The onPause method was called");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MESSAGE, "The onStop method was called");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MESSAGE, "The onRestart method was called");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MESSAGE, "The onDestroy method was called");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(MESSAGE, "The onSaveInstanceState method was called");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(MESSAGE, "The onRestoreInstanceState method was called");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.i(MESSAGE, "The onCreateOptionsMenu method was called");
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
