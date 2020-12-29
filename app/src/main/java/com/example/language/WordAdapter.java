package com.example.language;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolor;
    public WordAdapter(@NonNull Context context,@NonNull ArrayList<Word> words,int mColor) {
        super(context, 0, words);
        mcolor=mColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word currentWord=getItem(position);

        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        LinearLayout mLinearLayout=(LinearLayout)listItemView.findViewById(R.id.linerLayout);

        mLinearLayout.setBackgroundColor(ContextCompat.getColor(getContext(),mcolor));


        TextView mTranslation=(TextView)listItemView.findViewById(R.id.Translation);
        TextView mDefault=(TextView)listItemView.findViewById(R.id.defaultTranslation);
        ImageView mImage=(ImageView)listItemView.findViewById(R.id.image);

        mTranslation.setText(currentWord.getTranslation());
        mDefault.setText(currentWord.getDefault());
        mImage.setImageResource(currentWord.getmImageResource());
        return  listItemView;
    }
}
