package com.prakriti.sharedpreferences;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

import androidx.annotation.Nullable;

public class PreferencesActivity extends PreferenceActivity { // PreferenceFragment
// deprecated

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // saving data to preferences
        addPreferencesFromResource(R.xml.preferences_file); // similar to setContentView
    }
}


// https://github.com/commonsguy/cw-omnibus/blob/master/Prefs/FragmentsBC/app/src/main/java/com/commonsware/android/preffragsbc/EditPreferences.java