package com.example.language;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colors=new ArrayList<Word>();
        colors.add(new Word("father","lutti",R.drawable.family_father,R.raw.family_father));
        colors.add(new Word("mother","otiiko",R.drawable.family_mother,R.raw.family_mother));
        colors.add(new Word("three","tolookosu",R.drawable.family_mother,R.raw.number_one));
        colors.add(new Word("four","oyyisa",R.drawable.family_younger_brother,R.raw.number_one));
        colors.add(new Word("five","massokka",R.drawable.family_older_sister,R.raw.number_one));
        colors.add(new Word("six","temmokka",R.drawable.family_son,R.raw.number_one));
        colors.add(new Word("seven","kenekaku",R.drawable.family_younger_brother,R.raw.number_one));
        colors.add(new Word("eight","kawinta",R.drawable.family_older_brother,R.raw.number_one));
        colors.add(new Word("grandmother","wo’e",R.drawable.family_grandmother,R.raw.family_grandmother));
        colors.add(new Word("grandfather","na’aacha",R.drawable.family_grandfather,R.raw.family_grandfather));

        ListView list=(ListView)findViewById(R.id.list);

        WordAdapter adapter=new WordAdapter(this, colors,R.color.category_colors);
        list.setAdapter(adapter);
    }
}