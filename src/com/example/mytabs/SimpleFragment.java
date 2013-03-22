package com.example.mytabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class SimpleFragment extends SherlockFragment{
	static final int POPULATE_ID = Menu.FIRST;
    static final int CLEAR_ID = Menu.FIRST+1;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_main, container, false);
        return v;
    }
	
	@Override public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        MenuItem populateItem = menu.add(Menu.NONE, POPULATE_ID, 0, "Populate");
        populateItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        MenuItem clearItem = menu.add(Menu.NONE, CLEAR_ID, 0, "Clear");
        clearItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
    }
	
}
