package com.example.projectnewsutsrev10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailNewsActivity extends AppCompatActivity {
    TextView dNewsTitle;
    TextView dNewsCat;
    TextView dNewsAge;
    TextView dNewsCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

//        assign data from intent
        Bundle bundle = getIntent().getExtras();
        String dTitleText = bundle.getString("TITLE");
        String dCatText = bundle.getString("NEWSCATEGORY");
        String dAgeText = bundle.getString("MINAGE");
        String dConText = bundle.getString("CONTENT");

//        assign layout variable
        dNewsTitle = findViewById(R.id.detail_news_title);
        dNewsCat = findViewById(R.id.detail_category);
        dNewsAge = findViewById(R.id.detail_age);
        dNewsCon = findViewById(R.id.detail_content);

//        set text to layout
        dNewsTitle.setText(dTitleText);
        dNewsCat.setText(dCatText);
        dNewsAge.setText(dAgeText);
        dNewsCon.setText(dConText);
    }
}