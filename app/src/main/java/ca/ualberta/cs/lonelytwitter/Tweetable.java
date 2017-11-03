package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

// Made declaration access weaker (package-private)
interface Tweetable {
    // Removed redundant public methods in interface
    String getMessage();

    Date getDate();

}
