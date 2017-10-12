package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by kdehaan on 11/10/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testDelete() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("removing tweet");
        list.add(tweet);
        list.delete(tweet);

        assertFalse(list.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
        try  {
            list.add(tweet);
            assertTrue(Boolean.FALSE);
        }  catch (IllegalArgumentException e) {
            assertTrue(Boolean.TRUE);
        }

    }

    public void testGetTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        list.add(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(tweet.getMessage(), returnedTweet.getMessage());
    }

    public void testGetTweets() {
        TweetList list = new TweetList();
        Tweet tweet1 = new NormalTweet("1");
        list.add(tweet1);
        Tweet tweet2 = new NormalTweet("2");
        list.add(tweet2);
        Tweet tweet3 = new NormalTweet("3");
        list.add(tweet3);

        ArrayList<Tweet> gotTweets = list.getTweets();
        assertEquals(gotTweets.get(0).getMessage(), "1");
        assertEquals(gotTweets.get(1).getMessage(), "2");
        assertEquals(gotTweets.get(2).getMessage(), "3");

    }

    public void testGetCount() {
        TweetList list = new TweetList();
        Tweet tweet1 = new NormalTweet("1");
        list.add(tweet1);
        Tweet tweet2 = new NormalTweet("2");
        list.add(tweet2);
        Tweet tweet3 = new NormalTweet("3");
        list.add(tweet3);

        assertEquals(list.getCount(), 3);
    }
}
