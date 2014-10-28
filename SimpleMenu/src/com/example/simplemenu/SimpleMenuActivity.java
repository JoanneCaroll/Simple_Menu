package com.example.simplemenu;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class SimpleMenuActivity extends ActionBarActivity {

	TextView menuLabel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_menu);
        menuLabel = (TextView)findViewById(R.id.menu_label);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.simple_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.add) {
           menuLabel.setText(R.string.add);
        }
        if (id == R.id.edit) {
            menuLabel.setText(R.string.edit);
        }
        if (id == R.id.delete) {
            menuLabel.setText(R.string.delete);
        }
        if (id == R.id.save) {
            menuLabel.setText(R.string.save);
        }
        if (id == R.id.load) {
            menuLabel.setText(R.string.load);
        }
        return super.onOptionsItemSelected(item);
    }
}
