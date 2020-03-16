package com.gemaadhan.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mSound;
    private int mImageRId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageRId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageRId = mImageRId;
    }


    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageRId, int mSound) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageRId = mImageRId;
        this.mSound = mSound;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public int getmImageRId() {
        return mImageRId;
    }

    public boolean hasImage() {
        return mImageRId != NO_IMAGE_PROVIDED;
    }

    public void setmSound(int mSound) {
        this.mSound = mSound;
    }

    public int getmSound() {
        return mSound;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mSound=" + mSound +
                ", mImageRId=" + mImageRId +
                '}';
    }
}
