package PlaylistProject;
/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?

    private String title; 
    private String artist;
    private int duration; 
    private boolean isLiked; 
    




    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */

     public Song(String titleInput, String artistInput, int durationInput) {

        title = titleInput;
        artist = artistInput;
        duration = durationInput;
        isLiked = false; //not liked
    }



     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */


   
    public String getTitle() {
        return title;
    }


    public String getArtist() {
        return artist;
    }


    public int getDuration() {
        return duration;
    }

   
    public boolean isLiked() {
        return isLiked;
    }




    /**
     * Setter method
     */
    public void toggleLiked() {
        isLiked = !isLiked;
    }
}




