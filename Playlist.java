package PlaylistProject;
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

     private ArrayList<Song> songs;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

      public Playlist(){
        songs = new ArrayList<Song>();
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

    public void AddSong(Song a){
        songs.add(a);
    }

    public void RemoveSong(Song a){
        songs.remove(a);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void likeSong(int index) {
        if (index >= 0 && index < songs.size()) {
            songs.get(index).setLiked(true);
        }
    }

    public void examineAllSongs() {
        System.out.println(songs);
    }

    public void examineLikedSongs() {
        ArrayList<Song> likedSongs = new ArrayList<>();
        for (Song song : songs) {
            if (song.isLiked()) {
                likedSongs.add(song);
            }
        }
        System.out.println(likedSongs);
    }

    public int getTotalDuration() {
        int totalDuration = 0;
        for (Song song : songs) {
            totalDuration += song.getDuration();
        }
        return totalDuration;
    }




}
