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
    
    public void setComment(String comment)
    {
        this.comment=comment;
    }

    public String getComment()
    {
    return comment;
}
     public void setOwn(boolean ownIt)
    {
        gotIt = ownIt;
    }
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
public void setGenre(String genre)       
{
    this.genre=genre;
}
}

