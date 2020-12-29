package com.example.language;

public class Word {

    private String mDefaultTranslation,mMiwokTranslation;
    private int mImageResource,mAudioResource;

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResource=" + mImageResource +
                ", mAudioResource=" + mAudioResource +
                '}';
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResource, int audioResource)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResource=imageResource;
        mAudioResource=audioResource;
    }
    public String getDefault()
    {
        return mDefaultTranslation;
    }
    public String getTranslation()
    {
        return mMiwokTranslation;
    }
    public int getmImageResource()
    {
        return mImageResource;
    }
    public int getmAudioResource()
    {
        return mAudioResource;
    }
}
