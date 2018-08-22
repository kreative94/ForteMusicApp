package com.example.android.fortemusicapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;

public class TheArtists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_artists);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<Artist> artists = new ArrayList<>();

        artists.add(new Artist("Andrew Appliepie", R.drawable.andrew_applepie));
        artists.add(new Artist("Dan-O", R.drawable.dan_o));
        artists.add(new Artist("Dylla Swain", R.drawable.dylla_swain));
        artists.add(new Artist("Hurley Mower", R.drawable.hurley_mower));
        artists.add(new Artist("Johnny Rock", R.drawable.johnny_rock));
        artists.add(new Artist("Kevin MacLeod", R.drawable.kevin_macleod));
        artists.add(new Artist("Maxzwell", R.drawable.maxzwell));
        artists.add(new Artist("Partners in Rhyme", R.drawable.partners_in_rhyme));
        artists.add(new Artist("Vincent Augustus", R.drawable.vincent_augustus));

        //The List view to display all the artists
        GridView artistGrid = findViewById(R.id.artist_list);
        //Creates the artistsAdapter
        ArtistAdapter artistsAdapter = new ArtistAdapter(this, artists);
        //Sets the artistsAdapter to the GridView
        artistGrid.setAdapter(artistsAdapter);
    }

}
