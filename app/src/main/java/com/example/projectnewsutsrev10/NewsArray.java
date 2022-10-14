package com.example.projectnewsutsrev10;

import java.util.ArrayList;

public class NewsArray{
    ArrayList<News> news = new ArrayList<>();

    public NewsArray() {
        this.news = addData();
    }

    public ArrayList<News> addData(){
        ArrayList<News> newsList = new ArrayList<>();

        News news1 = new News("Fakta Microsoft Office, Software Legendaris yang Dipensiunkan","Technology",13);
        News news2 = new News("Fakta Microsoft Office, Software Legendaris yang Dipensiunkan","Technology",15);
        News news3 = new News("Fakta Microsoft Office, Software Legendaris yang Dipensiunkan","Technology",18);
        News news4 = new News("Fakta Microsoft Office, Software Legendaris yang Dipensiunkan","Sports",13);
        News news5 = new News("Fakta Microsoft Office, Software Legendaris yang Dipensiunkan","Sports",15);
        News news6 = new News("Fakta Microsoft Office, Software Legendaris yang Dipensiunkan","Sports",18);
        News news7 = new News("Fakta Microsoft Office, Software Legendaris yang Dipensiunkan","Health",13);
        News news8 = new News("Fakta Microsoft Office, Software Legendaris yang Dipensiunkan","Health",15);
        News news9 = new News("Fakta Microsoft Office, Software Legendaris yang Dipensiunkan","Health",18);

        news1.content = "aaaa";
        news2.content = "aaaa";
        news3.content = "aaaa";
        news4.content = "aaaa";
        news5.content = "aaaa";
        news6.content = "aaaa";
        news7.content = "aaaa";
        news8.content = "aaaa";
        news9.content = "aaaa";

        newsList.add(news1);
        newsList.add(news2);
        newsList.add(news3);
        newsList.add(news4);
        newsList.add(news5);
        newsList.add(news6);
        newsList.add(news7);
        newsList.add(news8);
        newsList.add(news9);

        return newsList;
    }
}
