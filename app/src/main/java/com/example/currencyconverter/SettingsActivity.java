package com.example.currencyconverter;

import android.os.Bundle;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    Switch themeSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        PrefManager.applyTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        themeSwitch = findViewById(R.id.themeSwitch);

        themeSwitch.setChecked(PrefManager.isDarkMode(this));

        themeSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            PrefManager.setDarkMode(this, isChecked);
            recreate();
        });
    }
}