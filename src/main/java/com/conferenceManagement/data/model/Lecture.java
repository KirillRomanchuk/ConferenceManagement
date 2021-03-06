package com.conferenceManagement.data.model;

import com.conferenceManagement.data.Place;

import java.util.Date;

public class Lecture {
    private Integer id;
    private String topic;
    private User speaker;
    private Date date;
    private Place place;

    public Lecture() {
    }

    public Lecture(Integer id, String topic, User speaker, Date date, Place place) {
        this.id = id;
        this.topic = topic;
        this.speaker = speaker;
        this.date = date;
        this.place = place;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public User getSpeaker() {
        return speaker;
    }

    public void setSpeaker(User speaker) {
        this.speaker = speaker;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
