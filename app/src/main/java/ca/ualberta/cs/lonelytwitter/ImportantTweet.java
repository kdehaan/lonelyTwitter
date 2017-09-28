/*
 * ImportantTweet
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
 * Extends Tweet for Important situations
 * @author kdehaan
 * @version 1.5
 * @see Tweet
 * @see NormalTweet
 * @since 1.0
 * Created by kdehaan on 13/09/17.
 */
public class ImportantTweet extends Tweet {
    /**
     * Creates Important Tweet
     * @param message message of Tweet
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Creates Important Tweet
     *
     * @param message message of Tweet
     * @param date date of Tweet
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Describes if the Tweet is important
     *
     * @return true
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
