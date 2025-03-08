package PlaylistProject;
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

        // Create a new playlist
        Playlist myPlaylist = new Playlist();  // Changed playlist variable name to myPlaylist
        Song trackOne = new Song("'untitled 08 | 09.06.2014.'", "Kendrick Lamar", "3:55");  // Changed to trackOne
        Song trackTwo = new Song("'This Must Be the Place'", "Talking Heads", "4:56");  // Changed to trackTwo
        Song trackThree = new Song("'Check the Rhime'", "A Tribe Called Quest", "3:36");  // Changed to trackThree
        Song trackFour = new Song("'Con Altura'", "Rosalia", "2:41");  // Changed to trackFour
        Song trackFive = new Song("'California'", "Joni Mitchell", "3:50");  // Changed to trackFive

        /**
         * Add some songs here. Note that the format for adding a Song to the Playlist myPlaylist
         * is something like...
         * myPlaylist.addSong(new Song(..., ..., ...))
         */
        System.out.println("Adding songs to the Playlist...\n");
        myPlaylist.addToPlaylist(trackOne);
        myPlaylist.addToPlaylist(trackTwo);
        myPlaylist.addToPlaylist(trackThree);
        myPlaylist.addToPlaylist(trackFour);
        myPlaylist.addToPlaylist(trackFive); //testing

        System.out.println("\nPrinting the songs...\n");
        // Print out all the songs in the playlist to verify it's working correctly
        myPlaylist.printSongs();

        System.out.println("\nLiking the songs in position 1, 3, 4, ...\n");
        // Once your songs are 'liked', this should be reflected in the next printout
        myPlaylist.likeSong(1);
        myPlaylist.likeSong(3);
        myPlaylist.likeSong(4);
        System.out.println("Printing the songs...\n");
        myPlaylist.printSongs();

        System.out.println("\nRemoving the song in position 2 ...\n");
        myPlaylist.removeSong(2);

        System.out.println("Printing the songs...\n");
        myPlaylist.printSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        // Your Playlist should be able to do this without looping while in main!
        myPlaylist.likedOnly();

        System.out.println("\nPrinting the total duration of all songs...\n");
        // Note that the format should look something like minutes:seconds
        myPlaylist.calculateDuration();

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        // This should be doable with a single method call
        myPlaylist.removeUnliked();

        System.out.println("Printing all songs...\n");
        myPlaylist.printSongs();
        // This should now look like only the liked songs list from before
    }
}