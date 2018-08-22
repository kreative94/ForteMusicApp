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

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView artistsTextView = findViewById(R.id.upcoming_artists_textview);
        TextView playlistTextView = findViewById(R.id.songs_textview);

        artistsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsCategory = new Intent(MainActivity.this, TheArtists.class);
                startActivity(artistsCategory);
            }
        });

        playlistTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistCategory = new Intent(MainActivity.this, Playlist.class);
                startActivity(playlistCategory);
            }
        });
    }

}