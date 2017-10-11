package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by kdehaan on 11/10/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        list.delete(tweet);
        assertTrue(!list.hasTweet(tweet));
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testDelete() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
        list.delete(tweet);
        assertTrue(!list.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("Test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }
}
