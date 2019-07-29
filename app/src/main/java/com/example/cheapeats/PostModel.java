package com.example.cheapeats;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.GeoPoint;

import java.util.List;
//import com.google.type.Date;


public class PostModel {


    private float rating;
    //    private Date startTime;
    private String authorUserId;
    private int flagCount, cloutValue;
    private GeoPoint location;
    private String title, host, description;
    private List<String> tags;

    /**
     *
     * @param title
     * @param host
     * @param description
     * @param authorUserId
     * @param tags
     * @param rating
     */
    public PostModel(String title,String host, String description, String authorUserId, List<String> tags, float rating) {
        this.title = title;
        this.host = host;
        this.description = description;
        this.authorUserId = authorUserId;
        this.tags = tags;
        this.flagCount = 0;
        this.cloutValue = (int) rating;
        this.rating = rating;
//        this.startTime = startTime;
//        this.location = location;
    }

    public PostModel(String title, String host, String description, List<String> tags){
        this.title = title;
        this.host = host;
        this.description = description;
        this.tags = tags;
    }

    public PostModel(){

    }

    /**
     * Data model representing an event posting in the Firestore Database
     * @param title
     * @param description
     */
    public PostModel(String title, String description){
        this.title = title;
        this.description = description;
    }


//    public Date getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(Date startTime) {
//        this.startTime = startTime;
//    }

//    public User getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(User author) {
//        this.author = author;
//    }

    public int getFlagCount() {
        return flagCount;
    }

    public void setFlagCount(int flagCount) {
        this.flagCount = flagCount;
    }

    public int getCloutValue() {
        return cloutValue;
    }

    public void setCloutValue(int cloutValue) {
        this.cloutValue = cloutValue;
    }

    public GeoPoint getLocation() {
        return location;
    }

    public void setLocation(GeoPoint location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
