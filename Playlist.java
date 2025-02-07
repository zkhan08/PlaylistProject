import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> playlist;

    public Playlist() {
        playlist = new ArrayList<Song>();
    }

    // Add a song to the playlist
    public void addToPlaylist(Song asong) {
        playlist.add(asong);
        System.out.println("Added " + playlist.get(playlist.size() - 1).toString());
    }

    // Print out all the songs in the playlist
    public void printSongs() {
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(playlist.get(i).toString());
        }
    }

    // Like a song at a specific position (1-based index)
    public void likeSong(int x) {
        if (x >= 1 && x <= playlist.size()) {
            playlist.get(x - 1).like();
        }
    }

    // Remove a song at a specific position (1-based index)
    public void removeSong(int x) {
        if (x >= 1 && x <= playlist.size()) {
            playlist.remove(x - 1);
        }
    }

    // Print out only the liked songs
    public void likedOnly() {
        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.get(i).isLiked()) {
                System.out.println(playlist.get(i).toString());
            }
        }
    }

    // Calculate the total duration of all songs in minutes:seconds format
    public void calculateDuration() {
        int totalSec = 0;
        int finalSec = 0;
        int finalMin = 0;
        String finalSeconds = "";

        for (int i = 0; i < playlist.size(); i++) {
            totalSec += playlist.get(i).getTimeInSeconds();
        }

        finalMin = totalSec / 60;
        finalSec = totalSec % 60;

        if (finalSec < 10) {
            finalSeconds = "0" + Integer.toString(finalSec);
        } else {
            finalSeconds = Integer.toString(finalSec);
        }

        System.out.println(finalMin + ":" + finalSeconds);
    }

    // Remove all unliked songs from the playlist
    public void removeUnliked() {
        for (int i = 0; i < playlist.size(); i++) {
            if (!playlist.get(i).isLiked()) {
                playlist.remove(i);
                i--;  // Adjust index after removal
            }
        }
    }
}
