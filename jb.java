package com.color.speechbubble;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SpinnerAdapter;

public class jb extends Activity
{
	EditText etn;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fp);
		
	}
	public void nB(View vi){
		
		
		Intent i=new Intent(getApplicationContext(),MessageActivity.class);
		startActivity(i);
	}

}