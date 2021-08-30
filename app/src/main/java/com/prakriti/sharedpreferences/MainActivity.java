package com.prakriti.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
// SharedPreferences to save application state in memory

    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked) {
            buttonView.setText("The Box Has Been Checked");
        }
        else {
            buttonView.setText("The Box Is Not Checked");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
//        Toast.makeText(this, "onPause called", Toast.LENGTH_SHORT).show();
//        // save instance state
//        SharedPreferences sharedPreferences = getPreferences(0);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString("CHECKBOX_TEXT", checkBox.getText().toString());
//        editor.putBoolean("CHECKBOX_VALUE", checkBox.isChecked());
//        editor.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Toast.makeText(this, "onResume called", Toast.LENGTH_SHORT).show();
//        // retrieve state
//        SharedPreferences sharedPreferences = getPreferences(0);
//        boolean checkboxValue = sharedPreferences.getBoolean("CHECKBOX_VALUE", false); // also pass default value
//        String checkboxText = sharedPreferences.getString("CHECKBOX_TEXT", "My Checkbox");
//        checkBox.setChecked(checkboxValue);
//        checkBox.setText(checkboxText);
    }

    public void nextActivity(View v) {
        startActivity(new Intent(this, NextActivity.class));
    }
}