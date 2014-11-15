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
    private EditText vpn_name_et        = null;
    private EditText vpn_type_et        = null;
    private EditText vpn_server_et      = null;
    private CheckBox vpn_mppe_cb        = null;
    private EditText vpn_username_et    = null;
    private EditText vpn_password_et    = null;
    private Spinner auto_spinner_s      = null;

    /**
     * PPTP Vpn keys
     */
    private static final String VPN_NAME_KEY        = "vpn_name";
    private static final String VPN_TYPE_KEY        = "vpn_type";
    private static final String VPN_SERVER_KEY      = "vpn_server";
    private static final String VPN_MPPE_ENABLE_KEY = "vpn_mppe_enable";
    private static final String VPN_USERNAME_KEY    = "vpn_username";
    private static final String VPN_PASSWORD_KEY    = "vpn_password";
    private static final String VPN_AUTO_MODE_KEY   = "vpn_auto_mode";
	
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
		vpn_name_et = (EditText)findViewById(R.id.vpn_name);
		vpn_type_et = (EditText)findViewById(R.id.vpn_type);
		vpn_server_et = (EditText)findViewById(R.id.vpn_server);
		vpn_mppe_cb = (CheckBox)findViewById(R.id.vpn_mppe);
		vpn_username_et = (EditText)findViewById(R.id.vpn_username);
		vpn_username_et = (EditText)findViewById(R.id.vpn_password);
		auto_spinner_s = (Spinner)findViewById(R.id.auto_mode_spinner);
		AutoModeAdapter spinnerAdapter = new AutoModeAdapter(this, 
				R.layout.auto_mode_spinner_item, AUTO_CONNECT_MODES);
		auto_spinner_s.setAdapter(spinnerAdapter);
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
