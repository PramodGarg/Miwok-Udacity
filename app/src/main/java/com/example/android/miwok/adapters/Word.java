package com.example.android.miwok.adapters;

/**
 * Created by Darknight on 21-02-2017.
 */

public class Word {

    private final int NO_IMAGE = -1;
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImage = NO_IMAGE;
    private int mAudio;


    public Word(String englishTranslation, String miwokTranslation, int mimage, int audio) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mImage = mimage;
        mAudio = audio;
    }

    public Word(String englishTranslation, String miwokTranslation, int audio) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mAudio = audio;
    }

    /**
     * @return mMiwok translation for the word
     */

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return mEnglishTranslation Endlish translation for the word
     */
    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    /**
     * Returns  the id o drawable to display against the word
     *
     * @return
     */
    public int getImage() {
        return mImage;
    }

    /**
     * returns the id of the audio file for the pronunciation of the word.
     *
     * @return
     */
    public int getAudio() {
        return mAudio;
    }

    public boolean hasImage() {
        return mImage != NO_IMAGE;
    }
}
