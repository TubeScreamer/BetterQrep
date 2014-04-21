package cto.lead.betterqapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

/*
 *  check boxes				// UICheckBox
 *  combo boxes 			// UISpinner 
 *  radio buttons			// UIRadioGroup
 *  rate					// UIRatingsBar
 *  pictures
 *  slider
 */
public class UIElementsActivity extends Activity 
{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ui_elements_screen);
		
		/*
		 * Check box
		 */
		final CheckBox checkbox = (CheckBox) findViewById(R.id.ui_checkbox);
        checkbox.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (checkbox.isChecked()) {
					checkbox.setText("I'm checked");
				} else {
					checkbox.setText("I'm not checked");
				}
			}
		});
        
        final Button button = (Button) findViewById(R.id.ui_button);
        button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (checkbox.isShown()) {
					checkbox.setVisibility(View.INVISIBLE);
					button.setText("Unhide CheckBox");
				} else {
					checkbox.setVisibility(View.VISIBLE);
					button.setText("Hide CheckBox");
				}
			}
		});
        
        /*
         * Radio
         */
        final TextView tv = (TextView) findViewById(R.id.ui_textView);

		final OnClickListener radioListener = new OnClickListener() {
			@Override
			public void onClick(View v) {
				RadioButton rb = (RadioButton) v;
				tv.setText(rb.getText() + " chosen");
			}
		};
		final RadioButton choice1 = (RadioButton) findViewById(R.id.choice1);
		choice1.setOnClickListener(radioListener);

		final RadioButton choice2 = (RadioButton) findViewById(R.id.choice2);
		choice2.setOnClickListener(radioListener);

		final RadioButton choice3 = (RadioButton) findViewById(R.id.choice3);
		choice3.setOnClickListener(radioListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
