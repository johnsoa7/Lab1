/**
 * The Item class represents a multi-media item.
 * Information about the item is stored and can be retrieved.
 * This class serves as a superclass for more specific itms.
 * 
 */
public class Item
{
    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    private String genre;

    /**
     * Initialise the fields of the item.
     * @param theTitle The title of this item.
     * @param time The running time of this item.
     * @param genre
     */
    public Item(String theTitle, int time)
    {
        this.title = theTitle;
        this.playingTime = time;
        this.gotIt = false;
        this.comment = "";
        this.genre="<no genre entered>";
    }

    /**
     * Enter a comment for this item.
     * @param comment The comment to be entered.
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * @return The comment for this item.
     */
    public String getComment()
    {
        return this.comment;
    }

    /**
     * Set the flag indicating whether we own this item.
     * @param ownIt true if we own the item, false otherwise.
     */
    public void setOwn(boolean ownIt)
    {
        this.gotIt = ownIt;
    }

    /**
     * @return true if we own a copy of this item.
     */
    public boolean getOwn()
    {
        return this.gotIt;
    }
      /**
     * @return The genre for this item.
     */
    public String getGenre()
    {
        return this.genre;
        
    }
     /**
     * Enter a genre for this item.
     * @param genre The genre to be entered.
     */
    public void setGenre(String genre)
    {
        this.genre=genre;
    }

    /**
     * Print details about this item to the text terminal.
     */
    public void print()
    {
        System.out.print("title: " + this.title + " (" + this.playingTime + " mins)");
        if(this.gotIt) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("    " + this.comment);
        {
        System.out.println(" " +this.genre);
    }
}
}
