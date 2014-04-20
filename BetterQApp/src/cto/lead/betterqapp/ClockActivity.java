package cto.lead.betterqapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ClockActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clock_screen);
		
		AnalogClock ac = (AnalogClock)findViewById(R.id.analogClock1);
		ac.setBackgroundColor(Color.YELLOW);
		ac.setSoundEffectsEnabled(true);
		
		DigitalClock dc = (DigitalClock)findViewById(R.id.digitalClock1);
		dc.setBackgroundColor(Color.MAGENTA);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
