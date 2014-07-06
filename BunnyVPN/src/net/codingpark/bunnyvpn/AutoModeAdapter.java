package net.codingpark.bunnyvpn;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class AutoModeAdapter extends ArrayAdapter<String> {


	public AutoModeAdapter(Context context, int resource,
			String[] objects) {
		super(context, resource, objects);
	}
	

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return super.getView(position, convertView, parent);
	}

}
