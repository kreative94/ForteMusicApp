package com.example.android.fortemusicapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView top10 = findViewById(R.id.top10_textview);
        TextView upcomingArtists = findViewById(R.id.upcoming_artists_textview);
        TextView newReleases = findViewById(R.id.new_releases_textview);

        top10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent top10Category = new Intent(MainActivity.this, Top10.class);
                startActivity(top10Category);
            }
        });

        upcomingArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent upComingArtistsCategory = new Intent(MainActivity.this, Top10.class);
                startActivity(upComingArtistsCategory);
            }
        });

        newReleases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newReleasesCategory = new Intent(MainActivity.this, Top10.class);
                startActivity(newReleasesCategory);
            }
        });
    }
}
