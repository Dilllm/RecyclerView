package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private MovieAdapter movieAdapter;
    RecyclerView rvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.rvMain);
        ModelMovie[] movies = new ModelMovie[]{
                new ModelMovie( "1001", "10 penampakan hiu di pantai", "BlastMan", R.drawable.playbuttonvideo)
        };
        movieAdapter = new MovieAdapter(movies, this);
        rvMain.setAdapter(movieAdapter);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
    }
}
