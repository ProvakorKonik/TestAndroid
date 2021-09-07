package com.example.myapplication;

public class Model {
    private String photoUrl = "NO";
    private String text = "NO";
    private String videofeed = "NO";

    public Model(String photoUrl, String text, String videofeed) {
        this.photoUrl = photoUrl;
        this.text = text;
        this.videofeed = videofeed;
    }

    public Model() {
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getVideofeed() {
        return videofeed;
    }

    public void setVideofeed(String videofeed) {
        this.videofeed = videofeed;
    }
}
