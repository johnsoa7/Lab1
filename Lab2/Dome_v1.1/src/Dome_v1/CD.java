package Dome_v1;

/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 */
public class CD
{
    private String title;
    private String artist;
    private int numberOfTracks;
    private int playingTime;
    private boolean gotIt;
    private String comment;
   private String genre;
 

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        title = theTitle;
        artist = theArtist;
        numberOfTracks = tracks;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
        genre = "<no genre entered>";
    }

    /**
     * Enter a comment for this CD.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this CD.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this CD.
     * @param ownIt true if we own the CD, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this CD.
     */
    public boolean getOwn()
    {
        return gotIt;
        
    }
    /**
     * Enter a genre for this CD.
     * @param genre The genre to be entered.
     */
    public void setGenre(String genre)
    {
        this.genre=genre;
    }
    /**
     * @return The genre for this CD.
     */
    public String getGenre()
    {
        return genre;
    }

    /**
     * Print details about this CD to the text terminal.
     */
    public void print()
    {
        System.out.print("CD: " + title + " (" + playingTime + " mins)");
        if(gotIt) {
            System.out.println("*");
        }
	else {
            System.out.println();
        }
        System.out.println("    " + artist);
	System.out.println("   Genre" + genre);
        System.out.println("    tracks: " + numberOfTracks);
        System.out.println("    " + comment);
    }
}
