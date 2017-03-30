package com.example.android.hinglish;

/**
 * Created by NISHANT on 13-03-2017.
 */

public class word {
    private String mDefaultTranslation;

    private String mHindiTranslation;

    public word(String defaultTranslation, String hindiTranslation) {
        mDefaultTranslation = defaultTranslation;
        mHindiTranslation = hindiTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmHindiTranslation() {
        return mHindiTranslation;
    }
}
