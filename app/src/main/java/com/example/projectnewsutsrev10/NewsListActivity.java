package com.example.projectnewsutsrev10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class NewsListActivity extends AppCompatActivity {
    private NewsArray completeNewsArrayClass;
    private RecyclerView recyclerView;
    private ArrayList<News> newsArray = new ArrayList<>();
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list);

//        get user age and preferred category
        Bundle bundle = getIntent().getExtras();
        String userCategory = bundle.getString("CATEGORY");
        String yearString = bundle.getString("YEAR");
        int userAge = 2022 - Integer.parseInt(yearString);

//        add data to array with method
        completeNewsArrayClass = new NewsArray();
        addPreferredNewsData(userAge,userCategory);

//        the recycle view
        newsAdapter = new NewsAdapter(this, newsArray);
        recyclerView = findViewById(R.id.recycleview_news);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(newsAdapter);
    }

//    add user-preferred news from news arraylist on News
    public void addPreferredNewsData(int age, String category){
        ArrayList <News> completeNewsArray = completeNewsArrayClass.news;
        for (int i = 0; i <= completeNewsArray.size()-1; i++){
            News currentNews = completeNewsArray.get(i);
            if (currentNews.category.equals(category) && currentNews.minimumAge <= age){
                newsArray.add(currentNews);
            } else {
                continue;
            }
        }
    }

}