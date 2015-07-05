package com.example.easywifi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		WifiAdmin wifiAdmin = new WifiAdmin(this);
		wifiAdmin.openWifi();
		wifiAdmin.addNetwork(wifiAdmin.CreateWifiInfo("MiPlus", "xl821010", 3));

	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
