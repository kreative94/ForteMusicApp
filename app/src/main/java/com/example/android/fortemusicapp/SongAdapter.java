package com.example.android.fortemusicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song>{
    private static final String LOG_TAG_TWO = SongAdapter.class.getSimpleName();

    /**
     * @param context The current context. Used to inflate the layout file.
     * @param songs A List of word objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     * list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Song currentSong = getItem(position);

        //Find the song title TextView id
        TextView songTitleTextView = listItemView.findViewById(R.id.song_title_textview);
        //Set the text on the song title TextView
        songTitleTextView.setText(currentSong.getmSongTitle());

        // Find the TextView in the song_list_item.xml layout with the song artist TextView
        TextView songArtistTextView = listItemView.findViewById(R.id.song_artist_textview);
        //Set the text to the ArtistTextView
        songArtistTextView.setText(currentSong.getmArtistName());

        //Find the ImageView in the song_list_item.xml layout with the song cover ImageView
        ImageView songCoverImageView = listItemView.findViewById(R.id.song_cover_imageview);
        songCoverImageView.setImageResource(currentSong.getmAlbumArt());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}