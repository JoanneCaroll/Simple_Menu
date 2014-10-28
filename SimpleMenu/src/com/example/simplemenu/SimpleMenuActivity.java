package com.example.simplemenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class SimpleMenuActivity extends ActionBarActivity {
	
	final int MENU_COLOR_RED = 1;
	final int MENU_COLOR_GREEN = 2;
	final int MENU_COLOR_BLUE = 3;
	final int MENU_SIZE_22 = 4;
	final int MENU_SIZE_26 = 5;
	final int MENU_SIZE_30 = 6;
	
	TextView dispText;
	TextView setColor;
	TextView setSize;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_menu);
        dispText = (TextView)findViewById(R.id.display_text);
        setColor = (TextView)findViewById(R.id.set_color);
        setSize = (TextView)findViewById(R.id.set_size);
        registerForContextMenu(setColor);
        registerForContextMenu(setSize);
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

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
        ContextMenuInfo menuInfo) {
      // TODO Auto-generated method stub
      switch (v.getId()) {
	    case R.id.set_color:
	      menu.add(0, MENU_COLOR_RED, 0, "Red");
	      menu.add(0, MENU_COLOR_GREEN, 0, "Green");
	      menu.add(0, MENU_COLOR_BLUE, 0, "Blue");
	      break;
	    case R.id.set_size:
	      menu.add(0, MENU_SIZE_22, 0, "22");
	      menu.add(0, MENU_SIZE_26, 0, "26");
	      menu.add(0, MENU_SIZE_30, 0, "30");
	      break;
    }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
      switch (item.getItemId()) {
    case MENU_COLOR_RED:
    	dispText.setTextColor(Color.RED);
      break;
    case MENU_COLOR_GREEN:
    	dispText.setTextColor(Color.GREEN);
      break;
    case MENU_COLOR_BLUE:
    	dispText.setTextColor(Color.BLUE);
      break;
    case MENU_SIZE_22:
    	dispText.setTextSize(22);
      break;
    case MENU_SIZE_26:
    	dispText.setTextSize(26);
      break;
    case MENU_SIZE_30:
    	dispText.setTextSize(30);
      break;
      }
      return super.onContextItemSelected(item);
    }
}
