public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");

        // Make your playlist here
        Playlist p = new Playlist();  // Use 'Playlist' with a capital P
        Song untitled08 = new Song("'untitled 08 | 09.06.2014.'", "Kendrick Lamar", "3:55");
        Song TMBTP = new Song("'This Must Be the Place'", "Talking Heads", "4:56");
        Song dominoes = new Song("'Check the Rhime'", "A Tribe Called Quest", "3:36");
        Song ConAl = new Song("'Con Altura'", "Rosalia", "2:41");
        Song cali = new Song("'California'", "Joni Mitchell", "3:50");

        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        System.out.println("Adding songs to the Playlist...\n");
        p.addToPlaylist(untitled08);
        p.addToPlaylist(TMBTP);
        p.addToPlaylist(dominoes);
        p.addToPlaylist(ConAl);
        p.addToPlaylist(cali); //testing

        System.out.println("\nPrinting the songs...\n");
        // Print out all the songs in the playlist to verify it's working correctly
        p.printSongs();

        System.out.println("\nLiking the songs in position 1, 3, 4, ...\n");
        // Once your songs are 'liked', this should be reflected in the next printout
        p.likeSong(1);
        p.likeSong(3);
        p.likeSong(4);
        System.out.println("Printing the songs...\n");
        p.printSongs();

        System.out.println("\nRemoving the song in position 2 ...\n");
        p.removeSong(2);

        System.out.println("Printing the songs...\n");
        p.printSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        // Your Playlist should be able to do this without looping while in main!
        p.likedOnly();

        System.out.println("\nPrinting the total duration of all songs...\n");
        // Note that the format should look something like minutes:seconds
        p.calculateDuration();

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        // This should be doable with a single method call
        p.removeUnliked();

        System.out.println("Printing all songs...\n");
        p.printSongs();
        // This should now look like only the liked songs list from before
    }
}
