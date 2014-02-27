package com.pisb.credenz13;
 
import java.util.HashMap;
 
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabContentFactory;
 
import com.pisb.credenz13.R;
 
/**
 * @author mwho
 *
 */
public class Credenz extends FragmentActivity implements TabHost.OnTabChangeListener {
 
    private TabHost mTabHost;
    private HashMap mapTabInfo = new HashMap();
    private TabInfo mLastTab = null;
 
    private class TabInfo {
         private String tag;
         private Class clss;
         private Bundle args;
         private Fragment fragment;
         TabInfo(String tag, Class clazz, Bundle args) {
             this.tag = tag;
             this.clss = clazz;
             this.args = args;
         }
 
    }
 
    class TabFactory implements TabContentFactory {
 
        private final Context mContext;
 
        /**
         * @param context
         */
        public TabFactory(Context context) {
            mContext = context;
        }
 
        /** (non-Javadoc)
         * @see android.widget.TabHost.TabContentFactory#createTabContent(java.lang.String)
         */
        @Override
		public View createTabContent(String tag) {
            View v = new View(mContext);
            v.setMinimumWidth(0);
            v.setMinimumHeight(0);
            return v;
        }
 
    }
    /** (non-Javadoc)
     * @see android.support.v4.app.FragmentActivity#onCreate(android.os.Bundle)
     */
    @Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Step 1: Inflate layout
        setContentView(R.layout.activity_credenz);
        // Step 2: Setup TabHost
        initialiseTabHost(savedInstanceState);
        if (savedInstanceState != null) {
            mTabHost.setCurrentTabByTag(savedInstanceState.getString("tab")); //set the tab as per the saved state
        }
    }
 
    /** (non-Javadoc)
     * @see android.support.v4.app.FragmentActivity#onSaveInstanceState(android.os.Bundle)
     */
    @Override
	protected void onSaveInstanceState(Bundle outState) {
        outState.putString("tab", mTabHost.getCurrentTabTag()); //save the tab selected
        super.onSaveInstanceState(outState);
    }
 
    /**
     * Step 2: Setup TabHost
     */
    private void initialiseTabHost(Bundle args) {
        mTabHost = (TabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup();
        TabInfo tabInfo = null;
        Credenz.addTab(this, this.mTabHost, this.mTabHost.newTabSpec("Home").setIndicator("Home"), ( tabInfo = new TabInfo("Home",Main_credenz.class, args)));
        this.mapTabInfo.put(tabInfo.tag, tabInfo);
        Credenz.addTab(this, this.mTabHost, this.mTabHost.newTabSpec("Events").setIndicator("Events"), ( tabInfo = new TabInfo("Events", Events.class, args)));
        this.mapTabInfo.put(tabInfo.tag, tabInfo);
        Credenz.addTab(this, this.mTabHost, this.mTabHost.newTabSpec("About").setIndicator("About"), ( tabInfo = new TabInfo("About", About_credenz.class, args)));
        this.mapTabInfo.put(tabInfo.tag, tabInfo);
        
        
        // Default to first tab
        this.onTabChanged("Home");
        //
        mTabHost.setOnTabChangedListener(this);
    }
 
    /**
     * @param activity
     * @param tabHost
     * @param tabSpec
     * @param clss
     * @param args
     */
    private static void addTab(Credenz activity, TabHost tabHost, TabHost.TabSpec tabSpec, TabInfo tabInfo) {
        // Attach a Tab view factory to the spec
        tabSpec.setContent(activity.new TabFactory(activity));
        String tag = tabSpec.getTag();
 
        // Check to see if we already have a fragment for this tab, probably
        // from a previously saved state.  If so, deactivate it, because our
        // initial state is that a tab isn't shown.
        tabInfo.fragment = activity.getSupportFragmentManager().findFragmentByTag(tag);
        if (tabInfo.fragment != null && !tabInfo.fragment.isDetached()) {
            FragmentTransaction ft = activity.getSupportFragmentManager().beginTransaction();
            ft.detach(tabInfo.fragment);
            ft.commit();
            activity.getSupportFragmentManager().executePendingTransactions();
        }
 
        tabHost.addTab(tabSpec);
    }
 
    /** (non-Javadoc)
     * @see android.widget.TabHost.OnTabChangeListener#onTabChanged(java.lang.String)
     */
    @Override
	public void onTabChanged(String tag) {
        TabInfo newTab = (TabInfo) this.mapTabInfo.get(tag);
        if (mLastTab != newTab) {
            FragmentTransaction ft = this.getSupportFragmentManager().beginTransaction();
            if (mLastTab != null) {
                if (mLastTab.fragment != null) {
                    ft.detach(mLastTab.fragment);
                }
            }
            if (newTab != null) {
                if (newTab.fragment == null) {
                    newTab.fragment = Fragment.instantiate(this,
                            newTab.clss.getName(), newTab.args);
                    ft.add(R.id.realtabcontent, newTab.fragment, newTab.tag);
                } else {
                    ft.attach(newTab.fragment);
                }
            }
 
            mLastTab = newTab;
            ft.commit();
            this.getSupportFragmentManager().executePendingTransactions();
        }
    }
 
}