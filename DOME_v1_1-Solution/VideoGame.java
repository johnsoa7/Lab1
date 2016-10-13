/**
 * The DVD class represents a DVD object. Information about the 
 * DVD is stored and can be retrieved.
 * 
 */public class VideoGame 
{
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    private int numberOfPlayers;
    private String platform;
    private String genre;

    /**
     * Initialize the VideoGame.
     * @param theTitle The title of the VideoGame.
     * @param theArtist The artist of the VideoGame.
     * @param tracks The number of tracks on the VideoGame.
     * @param time The playing time of the VideoGame.
     */
    public VideoGame(String theTitle, String thePlatform, int players, int time)
    {
        title = theTitle;
        platform = thePlatform;
        numberOfPlayers = players;
        playingTime = time;
        gotIt = false;
        comment = "<no comment>";
        genre = "<no genre entered>";
    }

    /**
     * Enter a comment for this VideoGame.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this VideoGame.
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Set the flag indicating whether we own this VideoGame.
     * @param ownIt true if we own the VideoGame, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this VideoGame.
     */
    public boolean getOwn()
    {
        return gotIt;
    }
    
    /**
     * Enter the genre of this VideoGame 
     * @param genre The genre to be entered.
     */
    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    /**
     * @return The genre for this VideoGame.
     */
    public String getGenre()
    {
        return genre;
    }


    /**
     * Print details about this VideoGame to the text terminal.
     */
    public void print()
    {
        System.out.print("VideoGame: " + title + " (" + playingTime + " mins)");
        if(gotIt) {
            System.out.println("*");
        }
	else {
            System.out.println();
        }
        System.out.println("    " + platform);
        System.out.println("    Genre: " + genre);
        System.out.println("    number of players: " + numberOfPlayers);
        System.out.println("    " + comment);
    }
}

