/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnsoa7
 */
public class VideoGame extends Item{
    private int numberOfPlayers;
    private String platform;
     private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    private String genre;

    public VideoGame(int numberOfPlayers, String platform, String title, int playingTime){
        super(platform, numberOfPlayers);
        this.title=title;
        this.playingTime=playingTime;
    }
    /**
     * @return The title for this VideoGame.
     */
     public String getTitle()
     { return this.title;
     
     }
     /**
     * Enter a title for this item.
     * @param title The title to be entered.
     */
     public void setTitle(String title)
     {
         this.title=title;
     }
     
  //**
   //  * @return The playingTime for this VideoGame.
    // */
     public int getPlayingTime()
     {
         return this.playingTime;
     }
      /**
     * Enter a playingTime for this item.
     * @param playingTime The playingTime to be entered.
     */
     public void setPlayingTime(int playingTime)
     {
         this.playingTime=playingTime;
     }
     }
     

