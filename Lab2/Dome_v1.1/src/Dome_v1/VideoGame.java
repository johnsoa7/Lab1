/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dome_v1;


 /**
     * Initialize the VideoGame.
     * @param theTitle The title of the VideoGame.
     * @param players The number of tracks on the VideoGame.
     * @param time The playing time of the VideoGame.
     */
public class VideoGame {
    private String title;
    private int numberofPlayers;
    private String platform;
    private int  playingtime;
    private boolean gotIt;
    private String comment;
    private String genre;
   
    public VideoGame( String theTitle, int players, String thePlatform, int time)
    {
        this.title=title;
        this.numberofPlayers=players;
        this.platform=platform;
        this.playingtime= time;
        this.gotIt=false;
        comment="<no comment>";
        this.genre="<no genre entered>";
        
        
    }
    /**
     * Enter a comment for this VideoGame.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment=comment;
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
    public void setTitle(String title)
    {
        this.title=title;
    }
public String getTitle()
{
    return title;
}
/**
     * Enter a genre for this VideoGame.
     * @param genre The genre to be entered.
     */
public void setGenre(String genre)       
{
    this.genre=genre;
}
 /**Prints details about this VideoGame to the text terminal.
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

