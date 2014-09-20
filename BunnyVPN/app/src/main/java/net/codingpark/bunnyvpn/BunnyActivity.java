package net.codingpark.bunnyvpn;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class BunnyActivity extends Activity {
	

	private static final String TAG = "BunnyActivity";
	
	/**
	 * UI Elements
	 */
	private EditText vpn_name		= null;
	private EditText vpn_type		= null;
	private EditText vpn_server		= null;
	private CheckBox vpn_mppe		= null;
	private EditText vpn_username	= null;
	private EditText vpn_password	= null;
	private Spinner auto_spinner 	= null;
	
	/**
	 * 3G		-- 0
	 * WIFI		-- 1
	 * ALL		-- 2
	 * NONE		-- 3
	 */
	private static final String[] AUTO_CONNECT_MODES = {"3G", "WIFI", "ALL", "NONE"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bunny);
		initUI();
	}
	
	private void initUI() {
		vpn_name = (EditText)findViewById(R.id.vpn_name);
		vpn_type = (EditText)findViewById(R.id.vpn_type);
		vpn_server = (EditText)findViewById(R.id.vpn_server);
		vpn_mppe = (CheckBox)findViewById(R.id.vpn_mppe);
		vpn_username = (EditText)findViewById(R.id.vpn_username);
		vpn_username = (EditText)findViewById(R.id.vpn_password);
		auto_spinner = (Spinner)findViewById(R.id.auto_mode_spinner);
		AutoModeAdapter spinnerAdapter = new AutoModeAdapter(this, 
				R.layout.auto_mode_spinner_item, AUTO_CONNECT_MODES);
		auto_spinner.setAdapter(spinnerAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bunny, menu);
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		Log.d(TAG, "Select options");
		
		if (item.getItemId() == R.id.action_about) {
			Log.d(TAG, "Select About options");
			Toast.makeText(this, R.string.copyright, Toast.LENGTH_SHORT).show();
		} else if (item.getItemId() == R.id.action_connect) {
			Log.d(TAG, "Select Connect options");
		} else if (item.getItemId() == R.id.action_edit) {
			Log.d(TAG, "Select Edit options");
		} else if (item.getItemId() == R.id.action_save) {
			Log.d(TAG, "Select Save options");
		}
		
		return super.onMenuItemSelected(featureId, item);
	}
	
}
