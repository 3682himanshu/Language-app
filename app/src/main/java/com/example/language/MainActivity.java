package com.example.language;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Todo

        TextView NumbersT=(TextView)findViewById(R.id.numbers);
        TextView FamilyT=(TextView)findViewById(R.id.family);
        TextView ColorT=(TextView)findViewById(R.id.colors);
        TextView PhrasesT=(TextView)findViewById(R.id.phrases);

        OnClickListener ob=new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=null;

                switch(v.getId())
                {
                    case R.id.numbers:
                        i=new Intent(v.getContext(),NumbersActivity.class);
                        break;
                    case R.id.family:
                        i=new Intent(v.getContext(),FamilyActivity.class);
                        break;
                    case R.id.colors:
                        i=new Intent(v.getContext(),ColorsActivity.class);
                        break;
                    case R.id.phrases:
                        i=new Intent(v.getContext(),PhrasesActivity.class);
                        break;
                }

                startActivity(i);
            }
        };
        NumbersT.setOnClickListener(ob);
        FamilyT.setOnClickListener(ob);
        ColorT.setOnClickListener(ob);
        PhrasesT.setOnClickListener(ob);
    }


}

