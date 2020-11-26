package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] nameList = {"Android Studio","Python","React","Slack","Webpack","Yarn","Css","Github","Html","Java"};
    String[] desList = {"Android Studio Description", "Python Description", "React Description", "Slack Description", "Webpack Description", "Yarn Description",
            "Css Description", "Github Description", "Html Description", "Java Description"};

    int [] iconList = {R.drawable.androidstudio, R.drawable.python, R.drawable.react, R.drawable.slack, R.drawable.webpack, R.drawable.yarn,
            R.drawable.css, R.drawable.github, R.drawable.html, R.drawable.java};

    RecyclerView recyclerView;
    MyAdapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Inflation 이것 때문에 activity_main 인식 가능?

        recyclerView = findViewById(R.id.RV_recyclerView);
        recyclerView.setHasFixedSize(true); // 크기 450 으로 고정됨

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter = new MyAdapter(this, nameList, desList, iconList);
        recyclerView.setAdapter(myAdapter);

    }

}