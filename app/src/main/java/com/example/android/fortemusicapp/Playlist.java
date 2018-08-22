package com.example.android.fortemusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //The List of Songs
        ArrayList<Song> songs = new ArrayList<>();

        //All the songs on the playlist
        songs.add(new Song("District Four", "Kevin MacLeod", R.drawable.district_four));
        songs.add(new Song("Outline", "Vincent Augustus", R.drawable.the_outline));
        songs.add(new Song("Shaving Mirror", "Kevin MacLeod", R.drawable.shaving_mirror));
        songs.add(new Song("Junk Ship Gold", "Dan-O", R.drawable.junk_yard_gold));
        songs.add(new Song("Blinding Lights", "Partners inn Rhyme", R.drawable.blinding_lights));
        songs.add(new Song("We Roll", "Maxzwell", R.drawable.we_roll));
        songs.add(new Song("I'm So", "Andrew Applepie", R.drawable.im_so));
        songs.add(new Song("A great day", "Johnny Rock", R.drawable.a_great_day));
        songs.add(new Song("Feel Good", "Dylla Swain", R.drawable.feel_good));
        songs.add(new Song("The Way", "Hurley Mower", R.drawable.the_way));

        //The List view to display all the songs on the playlist
        ListView songListView = findViewById(R.id.playlist_view);

        //Creates a song adapter for all songs on playlist
        SongAdapter songsAdapter = new SongAdapter(this, songs);

        //Sets the songsAdapter to the listView
        songListView.setAdapter(songsAdapter);
    }
}
