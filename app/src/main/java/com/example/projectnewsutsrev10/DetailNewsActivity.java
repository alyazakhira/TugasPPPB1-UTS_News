package com.example.projectnewsutsrev10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailNewsActivity extends AppCompatActivity {
    TextView dNewsTitle;
    TextView dNewsWri;
    TextView dNewsSou;
    TextView dNewsCon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_news);

//        assign data from intent
        Bundle bundle = getIntent().getExtras();
        String dTitleText = bundle.getString("TITLE");
        String dWriText = bundle.getString("WRITER");
        String dSouText = bundle.getString("SOURCE");
        String dConText = bundle.getString("CONTENT");

//        assign layout variable
        dNewsTitle = findViewById(R.id.detail_news_title);
        dNewsWri = findViewById(R.id.detail_writer);
        dNewsSou = findViewById(R.id.detail_source);
        dNewsCon = findViewById(R.id.detail_content);

//        set text to layout
        dNewsTitle.setText(dTitleText);
        dNewsWri.setText(dWriText);
        dNewsSou.setText(dSouText);
        dNewsCon.setText(dConText);
    }
}