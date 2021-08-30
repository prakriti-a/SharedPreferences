package com.prakriti.sharedpreferences;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private TextView text1, text2, text3;
    private Typeface font1, font2, font3, font4, font5, font6, font7, font8, font9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        font1 = Typeface.createFromAsset(getAssets(), "fonts/bagelad.otf");
        font2 = Typeface.createFromAsset(getAssets(), "fonts/BrownisRegular.ttf");
        font3 = Typeface.createFromAsset(getAssets(), "fonts/Hold On.ttf");
        font4 = Typeface.createFromAsset(getAssets(), "fonts/BlueberryLove.ttf");
        font5 = Typeface.createFromAsset(getAssets(), "fonts/FallenAngel.otf");
        font6 = Typeface.createFromAsset(getAssets(), "fonts/Floodicons-Regular.ttf");
        font7 = Typeface.createFromAsset(getAssets(), "fonts/Hiany Lau.ttf");
        font8 = Typeface.createFromAsset(getAssets(), "fonts/Qabil Free Trial.ttf");
        font9 = Typeface.createFromAsset(getAssets(), "fonts/summer flower.ttf");

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
    }

    private void setFontForFirstTextview() {
        if(sharedPreferences.getBoolean("CHECKBOX_TEXT1_FONT1", false)) { // true if checkbox is checked
            text1.setTypeface(font1);
        }
        else  if(sharedPreferences.getBoolean("CHECKBOX_TEXT1_FONT2", false)) {
            text1.setTypeface(font2);
        }
        else  if(sharedPreferences.getBoolean("CHECKBOX_TEXT1_FONT3", false)) {
            text1.setTypeface(font3);
        }
    }

    private void setFontSizeForFirstTextview() {
        String fontSize1 = sharedPreferences.getString("FONT_SIZE_TEXT1", "22");
            // since values inside string arrays are type String, so retrieve string value
        text1.setTextSize(Float.parseFloat(fontSize1));
    }

    private void setFontForSecondTextview() {
        if(sharedPreferences.getBoolean("CHECKBOX_TEXT2_FONT4", false)) { // true if checkbox is checked
            text2.setTypeface(font4);
        }
        else  if(sharedPreferences.getBoolean("CHECKBOX_TEXT2_FONT5", false)) {
            text2.setTypeface(font5);
        }
        else  if(sharedPreferences.getBoolean("CHECKBOX_TEXT2_FONT6", false)) {
            text2.setTypeface(font6);
        }
    }

    private void setFontSizeForSecondTextview() {
        String fontSize2 = sharedPreferences.getString("FONT_SIZE_TEXT2", "22");
        text2.setTextSize(Float.parseFloat(fontSize2));
    }

    private void setFontForThirdTextview() {
        if(sharedPreferences.getBoolean("CHECKBOX_TEXT3_FONT7", false)) { // true if checkbox is checked
            text3.setTypeface(font7);
        }
        else  if(sharedPreferences.getBoolean("CHECKBOX_TEXT3_FONT8", false)) {
            text3.setTypeface(font8);
        }
        else  if(sharedPreferences.getBoolean("CHECKBOX_TEXT3_FONT9", false)) {
            text3.setTypeface(font9);
        }
    }

    private void setFontSizeForThirdTextview() {
        String fontSize3 = sharedPreferences.getString("FONT_SIZE_TEXT3", "22");
        text3.setTextSize(Float.parseFloat(fontSize3));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume called", Toast.LENGTH_SHORT).show();
        // called when NextActivity is resumed after selecting preferences
        setFontForFirstTextview();
        setFontForSecondTextview();
        setFontForThirdTextview();

        setFontSizeForFirstTextview();
        setFontSizeForSecondTextview();
        setFontSizeForThirdTextview();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_next, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_settings:
                // move to preferences xml file
                startActivity(new Intent(this, PreferencesActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}