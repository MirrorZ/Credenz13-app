package com.pisb.credenz13;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class XOdia extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xodia);
		}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.xodia_details, menu);
		return true;
	}

}
