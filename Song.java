/**
 * File for a Song class to be used in the Playlist Project
 * @author Ryan and Conner
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private String artist;
    private int minutes;
    private int seconds;
    private boolean liked;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String name, String artist, int minutes, int seconds, boolean liked){
            this.name = name;
            this.artist = artist;
            this.minutes = minutes;
            this.seconds = seconds;
            this.liked = liked;
    }




     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getName()
    {
        return name;
    }
    public String getArtist()
    {
        return artist;
    }
    public String getTime()
    {
        return minutes+":"+seconds;
    }
    public boolean getLiked()
    {
        return liked;
    }
    public String toString()
    {
        if (liked)
        {
            return "\""+name+"\"" + " by " + artist + " ("+getTime() +") "+" -- liked";
        }
        else
        {
            return "\""+name+"\"" + " by " + artist + " ("+getTime() +")";
        }
    }

}
