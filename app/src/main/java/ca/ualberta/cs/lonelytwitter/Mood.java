/*
 * Mood
 *
 * Version 1.0
 *
 * September 27, 2017
 *
 * Copyright © 2017 Kevin de Haan, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute, or modify this code under terms and conditions of the COde of Student Behavior at the University of Alberta.
 * You can find a copy of the license in this project. Otherwise please contact kdehaan@ualberta.ca
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a mood
 * @author kdehaan
 * @version 1.5
 * @see Tweet
 * @see GoodMood
 * @see BadMood
 * @since 1.0
 * Created by kdehaan on 13/09/17.
 */

public abstract class Mood {
    private Date date;

    /**
     * Constructs a Mood object
     */
    public Mood(){
        date = new Date();
    }

    /**
     * Constructs a Mood object
     *
     * @param date date of mood
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * Get date of Mood
     *
     * @return date of Mood
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set date of Mood
     *
     * @param date date of Mood
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Does nothing
     *
     * @return
     */
    public abstract String getMood();
}
