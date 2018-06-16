package com.example.android.fortemusicapp;

import android.widget.ImageView;

/**
 * (@link Song) represents an individual single song. Songs can also be added to albums
 */
public class Song {

    //The Song Info

    //The song title
    private String mSongTitle;

    //The Artist
    private String mArtistName;

    //Album Cover
    private int mCoverArt;

    /**
     *
     * @param theTitle the song title
     * @param theArtist the artist of the song
     * @param theCover the song cover art
     */
    public Song(String theTitle, String theArtist, int theCover){
        mSongTitle = theTitle;
        mArtistName = theArtist;
        mCoverArt = theCover;
    }

    public String getSongTitle(){
        return  mSongTitle;
    }

    public String getArtistName(){
        return  mArtistName;
    }

    public int getCoverArt() {
        return mCoverArt;
    }
}
