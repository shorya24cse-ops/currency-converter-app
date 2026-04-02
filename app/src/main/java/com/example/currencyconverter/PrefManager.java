package com.example.currencyconverter;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatDelegate;

public class PrefManager {

    private static final String PREF = "settings";
    private static final String DARK_MODE = "dark_mode";

    public static void setDarkMode(Context context, boolean isDark) {
        SharedPreferences.Editor editor =
                context.getSharedPreferences(PREF, Context.MODE_PRIVATE).edit();
        editor.putBoolean(DARK_MODE, isDark);
        editor.apply();
    }

    public static boolean isDarkMode(Context context) {
        return context.getSharedPreferences(PREF, Context.MODE_PRIVATE)
                .getBoolean(DARK_MODE, false);
    }

    public static void applyTheme(Context context) {
        if (isDarkMode(context)) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}