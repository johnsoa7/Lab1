/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnsoa7
 */

public class DemoDatabase {
    public static void main( String[] args){
    // Create a new database object
Database d = new Database();
// Create some Item, CD and DVD objects
Item i1 = new CD("Vivaldi concertos", "Giuliano Carmignola", 12, 60);
Item i2 = new DVD("Seven Samurai", "Akira Kurosawa", 185);
CD cd2 = new CD("Schubert sonata in A", "Radu Lupu", 4, 35);
DVD dvd2 = new DVD("La Belle et la Bete", "Jean Cocteau", 120);
// Populate the database with the newly created CDs and DVDs
d.addItem(i1);
d.addItem(i2);
d.addItem(cd2);
d.addItem(dvd2);
// List the contents of the database
//d.list();
    

    // Test the accessor and mutator methods for field genre in Item
i1.setGenre("Classical");
i2.setGenre("Adventure/Drama");
i1.print();
System.out.println(" Genre: " + i1.getGenre());
System.out.println();//leave an empty line
i2.print();
System.out.println(" Genre: " + i2.getGenre());
System.out.println();//leave an empty line
    
    }
    }

