package com.example.android.tnt_v2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardViewActivity extends Activity {

    TextView categTV;
    TextView dateTV;
    TextView descTV;
    TextView totTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.card);
        categTV = (TextView) findViewById(R.id.txt_categ);
        dateTV = (TextView) findViewById(R.id.txt_date);
        descTV = (TextView) findViewById(R.id.txt_desc);
        totTV = (TextView) findViewById(R.id.txt_amt);
    }
}
