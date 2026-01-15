import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList <Song> Songs;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist ()
    {
        Songs = new ArrayList<Song>();
    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      public void addSong (String name, String artist, int minutes, int seconds){
        Song n = new Song(name, artist, minutes, seconds, false);
        Songs.add(n);
      }
      public void likeSong (String name)
      {
        for (int i = 0; i<Songs.size(); i++)
        {
          if (Songs.get(i).getName()==name)
          {
            Songs.get(i).toggleLike();
          }
        }
      }

      public void removeSong (String name)
      {
        for (int i = 0; i<Songs.size(); i++)
        {
          if (Songs.get(i).getName()==name)
          {
            Songs.remove(i);
          }
        }
      }

      public String examineSongs()
      {
        String songsList = "";
        for (int i = 0; i<Songs.size(); i++)
        {
          songsList+=Songs.get(i).toString()+"\n";
        }
        return songsList;
      }
      public String examineLikedSongs() {
        String likedSongList = "";
        for (int i = 0; i<Songs.size(); i++) {
            if (Songs.getLiked(i).equals(true)) {
                likedSongList += Songs.get(i).toString()+"\n";
            }
        }
        return likedSongList;
    }
}
