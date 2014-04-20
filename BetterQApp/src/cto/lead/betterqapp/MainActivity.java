package cto.lead.betterqapp;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private static final int MAX_ATTEMPTS = 3;
	public static final String TAG = "BetterQApp";
	
	private EditText username;
	private EditText password;
	private TextView attempts;
	private Button login;
	private int counter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_screen);
		counter = MAX_ATTEMPTS;
		username = (EditText)findViewById(R.id.editText1);
		password = (EditText)findViewById(R.id.editText2);
		attempts = (TextView)findViewById(R.id.textView5);
		attempts.setText(Integer.toString(counter));
		login = (Button)findViewById(R.id.button1);
	}

	public void login(View view){	
		if(username.getText().toString().equals("nik") && password.getText().toString().equals("zu")){
			Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
			
			this.setContentView(R.layout.main_screen);
		}
		else{
			Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
			attempts.setBackgroundColor(Color.RED);
			counter--;
			attempts.setText(Integer.toString(counter));
			if(counter <= 0){
				login.setEnabled(false);
			}
		}
	}
	
	public void showClock(View view){
		Intent intent = new Intent(this, ClockActivity.class);
		startActivity(intent);
	}
	
	public void showMap(View view){
		Intent intent = new Intent(this, MapActivity.class);
		startActivity(intent);
	}
	
	public void showList(View view){
		Intent intent = new Intent(this, ListWithSearchActivity.class);
		startActivity(intent);
	}
	
	public void showUIElements(View view){
		Intent intent = new Intent(this, UIElementsActivity.class);
		startActivity(intent);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onRestart() {
		Log.i(TAG, "The activity is about to be restarted.");
		super.onRestart();
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.i(TAG, "The activity is about to become visible.");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "The activity has become visible (it is now \"resumed\")");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(TAG,
				"Another activity is taking focus (this activity is about to be \"paused\")");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "The activity is no longer visible (it is now \"stopped\")");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "The activity is about to be destroyed.");
	}
}
