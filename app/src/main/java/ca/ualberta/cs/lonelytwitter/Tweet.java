/*
 * Tweet
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

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a tweet.
 * @author kdehaan
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 * Created by kdehaan on 13/09/17.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moodList = new ArrayList<Mood>();

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     */
    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    /**
     * Adds a mood to a tweet
     *
     * @param mood mood associated with tweet
     */
    public void addMood(Mood mood){
        moodList.add(mood);
    }

    /**
     * Gets the tweet message
     *
     * @return message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets the tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets date of tweet
     *
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date of tweet
     *
     * @param date date of twee
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();

    /**
     * Creates string representation of Tweet
     *
     * @return string representation of tweet
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}
