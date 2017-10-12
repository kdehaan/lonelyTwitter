package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by kdehaan on 11/10/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList() {

    }

    public void add(Tweet tweet) throws IllegalArgumentException {
        if (this.hasTweet(tweet)) {
            throw new IllegalArgumentException("Duplicate Tweet");
        }
        tweets.add(tweet);
    }

    public Boolean hasTweet(Tweet tweet) {
        for(Tweet object: tweets) {
            if( object.equals(tweet)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }
    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public int getCount() {
        return tweets.size();
    }

}
