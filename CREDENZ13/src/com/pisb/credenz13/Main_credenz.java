package com.pisb.credenz13;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.pisb.credenz13.R;
 
/**
 * @author mwho
 *
 */
public class Main_credenz extends Fragment {
    /** (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
     */
	private ImageButton fb;
	private ImageButton twitter;
	private ImageButton instagram;
    @Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        if (container == null) {
            // We have different layouts, and in one of them this
            // fragment's containing frame doesn't exist.  The fragment
            // may still be created from its saved state, but there is
            // no reason to try to create its view hierarchy because it
            // won't be displayed.  Note this is not needed -- we could
            // just run the code below, where we would create and return
            // the view hierarchy; it would just never be used.
            return null;
        }
        View view= inflater.inflate(R.layout.activity_main_credenz,
                container, false);
        ImageButton fb = (ImageButton) view.findViewById(R.id.fb);
	    fb.setOnClickListener(new OnClickListener() {
		      @Override
			public void onClick(View arg0) {
		        Intent viewIntent =new Intent("android.intent.action.VIEW",
		            Uri.parse("https://www.facebook.com/credenz13"));
		          startActivity(viewIntent);
		      }
		    });
	    ImageButton twitter = (ImageButton) view.findViewById(R.id.twitter);
	    twitter.setOnClickListener(new OnClickListener() {
		      @Override
			public void onClick(View arg0) {
		        Intent viewIntent =new Intent("android.intent.action.VIEW",
		            Uri.parse("https://twitter.com/credenz13"));
		          startActivity(viewIntent);
		      }
		    });
	    ImageButton instagram = (ImageButton) view.findViewById(R.id.instagram);
	    instagram.setOnClickListener(new OnClickListener() {
		      @Override
			public void onClick(View arg0) {
		        Intent viewIntent =new Intent("android.intent.action.VIEW",
		            Uri.parse("http://instagram.com/credenz13"));
		          startActivity(viewIntent);
		      }
		    });
        return view;
    }
}