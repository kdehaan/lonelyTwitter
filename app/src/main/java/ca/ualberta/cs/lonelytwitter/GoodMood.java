package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kdehaan on 13/09/17.
 */

public class GoodMood extends Mood{

    public GoodMood(){
        super();
    }

    public GoodMood(Date date){
        super(date);
    }

    @Override
    public String getMood(){
        return "Good";
    }
}
