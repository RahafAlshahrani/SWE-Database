package com.example.swedatabase;

import org.w3c.dom.Text;

import java.sql.Time;
import java.util.Date;

public class Event {
private String title;
private int date;
private int time;
private String location;
private String eventType;
private String description;
private String Coordinator_id;

    public Event(String title, int date, int time, String location, String eventType, String description, String coordinator_id) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.location = location;
        this.eventType = eventType;
        this.description = description;
        this.Coordinator_id = coordinator_id;
    }



    public Event(String title, int date, int time, String location, String eventType, String description) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.location = location;
        this.eventType = eventType;
        this.description = description; }
    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", location='" + location + '\'' +
                ", eventType='" + eventType + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
    }

    public int getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String getEventType() {
        return eventType;
    }

    public String getDescription() {
        return description;
    }

    public String getCoordinator_id() {
        return Coordinator_id;
    }

    public void setCoordinator_id(String coordinator_id) {
        Coordinator_id = coordinator_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEventType(String eventTime) {
        this.eventType = eventTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
