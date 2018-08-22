package com.example.android.fortemusicapp;

/**
 * (@link Song) represents an individual single song. Songs can also be added to albums
 */
public class Song {

    //The song title
    private String mSongTitle;

    //The Artist
    private String mArtistName;

    //Album Cover
    private int mAlbumArt;

    /**
     *
     * @param theTitle the song title
     * @param theArtist the artist of the song
     * @param albumCover the song cover art
     */
    public Song(String theTitle, String theArtist, int albumCover){
        mSongTitle = theTitle;
        mArtistName = theArtist;
        mAlbumArt = albumCover;
    }

    public String getmSongTitle(){
        return  mSongTitle;
    }

    public String getmArtistName(){
        return  mArtistName;
    }

    public int getmAlbumArt() {
        return mAlbumArt;
    }
}
