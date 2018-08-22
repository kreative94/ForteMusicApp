package com.example.android.fortemusicapp;

public class Artist {

    //The Artist's Name
    private String mArtistName;
    //The Artist's profile picture
    private int mArtistImage;

    /**
     * @param artistName the artist's name
     * @param artistImage the artist's profile image
     */
    public Artist(String artistName, int artistImage){
        mArtistName = artistName;
        mArtistImage = artistImage;
    }

    public String getArtistName(){
        return mArtistName;
    }

    public int getArtistImage(){
        return mArtistImage;
    }
}
