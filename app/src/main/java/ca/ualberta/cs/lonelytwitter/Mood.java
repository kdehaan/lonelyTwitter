package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kdehaan on 13/09/17.
 */

public abstract class Mood {
    private Date date;

    public Mood(){
        date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMood();
}
