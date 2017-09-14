package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kdehaan on 13/09/17.
 */

public class BadMood extends Mood {

    public BadMood(){
        super();
    }

    public BadMood(Date date){
        super(date);
    }

    @Override
    public String getMood(){
        return "Bad";
    }
}
