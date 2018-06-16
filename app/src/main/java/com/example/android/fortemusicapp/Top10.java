package com.example.android.fortemusicapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Top10 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);

        //The List of Songs
        ArrayList<Song> songs = new ArrayList<>();

        //All the songs on the playlist
        songs.add(new Song("District Four", "Kevin MacLeod", R.drawable.district_four));
        songs.add(new Song("Outline", "Vincent Augustus", R.drawable.the_outline));
        songs.add(new Song("Shaving Mirror", "Kevin MacLeod", R.drawable.district_four));
        songs.add(new Song("Junk Ship Gold", "Dan-O", R.drawable.district_four));
        songs.add(new Song("Blinding Lights", "Partners inn Rhyme", R.drawable.district_four));
        songs.add(new Song("We Roll", "Maxzwell", R.drawable.district_four));
        songs.add(new Song("I'm So", "Andrew Applepie", R.drawable.district_four));
        songs.add(new Song("A great day", "Johnny Rock", R.drawable.district_four));
        songs.add(new Song("Feel Good", "Dylla Swain", R.drawable.district_four));
        songs.add(new Song("The Way", "Hurley Mower", R.drawable.district_four));

        //Creates a song adapter for all songs on playlist
        SongAdapter songsAdapter = new SongAdapter(this, songs);

        //The List view to display all the songs on the playlist
        ListView listView = findViewById(R.id.list);

        //Sets the songsAdapter to the listView
        listView.setAdapter(songsAdapter);
    }
}
