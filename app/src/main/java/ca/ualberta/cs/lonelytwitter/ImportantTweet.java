package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kdehaan on 13/09/17.
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message){
        super(message);

    }

    public ImportantTweet(String message, Date date){
        super(message, date);
    }
}
