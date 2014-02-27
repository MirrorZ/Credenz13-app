package com.pisb.credenz13;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class PaperPresentation extends Activity {

	private ImageButton reg_button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.paper_presentation);
		
		ImageButton reg_button = (ImageButton)findViewById(R.id.reg_button);
	    reg_button.setOnClickListener(new OnClickListener() {
		      @Override
			public void onClick(View arg0) {
		        Intent viewIntent =new Intent("android.intent.action.VIEW",
		            Uri.parse("http://www.meraevents.com/event/credenz13"));
		          startActivity(viewIntent);
		      }
		    });
		}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.paper_details, menu);
		return true;
	}

}
