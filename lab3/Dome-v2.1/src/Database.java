import java.util.ArrayList;

/**
 * The database class provides a facility to store entertainment
 * item objects. A list of all items can be printed to the
 * terminal.
 * 
 * This version does not save the data to disk, and it does not
 * provide any search functions.
 * 
 */
public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        this.items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem)
    {
        this.items.add(theItem);
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void list()
    {
        for(Item item : this.items) {
            item.print();
            System.out.println();   // empty line between items
        }
    }
}
