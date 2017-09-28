/*
 * NormalTweet
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
 * Extends Tweet for normal situations
 * @author kdehaan
 * @version 1.5
 * @see Tweet
 * @see ImportantTweet
 * @since 1.0
 * Created by kdehaan on 13/09/17.
 */
public class NormalTweet extends Tweet {
    /**
     * Creates normal Tweet
     * @param message message of Tweet
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Creates normal Tweet
     *
     * @param message message of Tweet
     * @param date date of Tweet
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Describes if the Tweet is important
     *
     * @return false
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
