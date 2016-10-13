import java.util.ArrayList;

/**
 * The database class provides a facility to store CD and video 
 * objects. A list of all CDs and videos can be printed to the
 * terminal.
 * 
 * This version does not save the data to disk, and it does not
 * provide any search functions.
 * 
 */
public class Database
{
    private ArrayList<CD> cds;
    private ArrayList<DVD> dvds;
    private ArrayList<VideoGame> vgs;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        cds = new ArrayList<CD>();
        dvds = new ArrayList<DVD>();
        vgs = new ArrayList<VideoGame>();
    }

    /**
     * Add a CD to the database.
     * @param theCD The CD to be added.
     */
    public void addCD(CD theCD)
    {
        cds.add(theCD);
    }

    /**
     * Add a DVD to the database.
     * @param theDVD The DVD to be added.
     */
    public void addDVD(DVD theDVD)
    {
        dvds.add(theDVD);
    }
    
    /**
     * Add a VideoGame to the database.
     * @param theVideoGame The VideoGame to be added.
     */
    public void addVideoGame(VideoGame theVideoGame)
    {
        vgs.add(theVideoGame);
    }

    /**
     * Print a list of all currently stored CDs and DVDs to the
     * text terminal.
     */
    public void list()
    {
        // print list of CDs
        for(CD cd : cds) {
            cd.print();
            System.out.println();   // empty line between items
        }

        // print list of DVDs
        for(DVD dvd : dvds) {
            dvd.print();
            System.out.println();   // empty line between items
        }
        
        // print list of VideoGames
        for(VideoGame vg : vgs) {
            vg.print();
            System.out.println();   // empty line between items
        }
    }
}
