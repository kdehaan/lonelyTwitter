package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

import com.google.gson.Gson;

public class EditTweetActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        // Made intent local: class structure formatting
        Intent intent = getIntent();
        String gsonTweet = intent.getStringExtra("tweet");
        Gson gson = new Gson();

        // Made tweet local
        NormalTweet tweet = gson.fromJson(gsonTweet, NormalTweet.class);
        TextView tweetText = (TextView) findViewById(R.id.textView);
        tweetText.setText(tweet.getMessage());

    }
}
