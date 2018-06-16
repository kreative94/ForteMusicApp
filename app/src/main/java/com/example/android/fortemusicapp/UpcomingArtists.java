package com.example.android.fortemusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class UpcomingArtists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_artists);

        ArrayList<Artist> artists = new ArrayList<Artist>();


        ArtistAdapter artistsAdapter = new AritstAdapter(this, artists);;

        //The List view to display all the songs on the playlist
        ListView listView = findViewById(R.id.artist_list);

        //Sets the songsAdapter to the listView
        listView.setAdapter(artistsAdapter);
    }
}
