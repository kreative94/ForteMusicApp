package com.example.android.fortemusicapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist>{

    private static final String LOG_TAG = ArtistAdapter.class.getSimpleName();

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param artists A List of word objects to display in a list
     */
    public ArtistAdapter(Activity context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View artistGridItemView = convertView;
        if (artistGridItemView == null) {
            artistGridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Artist currentArtist = getItem(position);

        // Find the TextView in the artist_list_item.xml layout with the artist profile name text view
        TextView theArtistTextView = artistGridItemView.findViewById(R.id.artist_profile_name);
        //Set the text to the ArtistTextView
        theArtistTextView.setText(currentArtist.getArtistName());

        //Find the TextView in the artist_list_item.xml layout with the album artist cover image view
        ImageView artistImageView = artistGridItemView.findViewById(R.id.artist_profile_pic);
        artistImageView.setImageResource(currentArtist.getArtistImage());

        // Return the whole list item layout (containing 1 TextView and 1 ImageView)
        // so that it can be shown in the GridView
        return artistGridItemView;
    }
}