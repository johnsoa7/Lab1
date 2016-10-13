
public class DemoDatabase {
	
	/**
	 * Method main
	 *
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		// Create a new database object
        Database d = new Database();
        // Create some CD,  DVD and VideoGame objects
        CD cd1 = new CD("Vivaldi concertos", "Giuliano Carmignola", 12, 60);
        DVD dvd1 = new DVD("Seven Samurai", "Akira Kurosawa", 185);
        CD cd2 = new CD("Schubert sonata in A", "Radu Lupu", 6, 35);
        DVD dvd2 = new DVD("La Belle et la Bete", "Jean Cocteau", 120);
        VideoGame vg1 = new VideoGame("Resident Evil 4", "GameCube", 1, 120);
        VideoGame vg2 = new VideoGame("Second Life", "PC", 100, 300);
        
        // Populate the database with the newly created CDs, DVDs and Video Games
        d.addCD(cd1);
        d.addCD(cd2);
        d.addDVD(dvd1);
        d.addDVD(dvd2);
        d.addVideoGame(vg1);
        d.addVideoGame(vg2);
        // Test the accessor and mutator methods for field genre in CD, DVD and VideoGame        
        cd1.setGenre("Classical");
        dvd1.setGenre("Adventure/Drama");
        vg1.setGenre("Survival/Horror");        
        /*
        cd1.print();
        System.out.println("    Genre: " + cd1.getGenre());
        System.out.println();//leave an empty line
        dvd1.print();
        System.out.println("    Genre: " + dvd1.getGenre());
        System.out.println();//leave an empty line
        vg1.print();
        System.out.println("    Genre: " + vg1.getGenre());
        System.out.println();//leave an empty line
        */
        //List the database
        d.list();
	}	
}
