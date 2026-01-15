/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist Conner = new Playlist();
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        Conner.addSong("Night Changes", "One Direction", 3, 46);
        Conner.addSong("18", "One Direction", 4, 8);
        Conner.addSong("All of Me", "John Legend", 4, 29);
        Conner.addSong("Riptide", "Vance Joy", 3, 24);
        Conner.addSong("Love Story", "Taylor Swift", 3, 55);
        Conner.addSong("(Just a) Simple Sponge", "Ethan Slater", 3, 56);
        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        System.out.println(Conner.examineSongs());

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        Conner.likeSong("Night Changes");
        Conner.likeSong("18");
        Conner.likeSong("Love Story");

        System.out.println("Printing the songs...\n");
        System.out.println(Conner.examineSongs());

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        Conner.removeSong("Riptide");

        System.out.println("Printing the songs...\n");
        System.out.println(Conner.examineSongs());

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        System.out.println(Conner.examineLikedSongs());

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(Conner.getSongTime()/60 + ":" + Conner.getSongTime()%60);

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        Conner.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.println(Conner.examineSongs());
    }
}
