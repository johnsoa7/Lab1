/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dome_v1;

/**
 *
 * @author johnsoa7
 */
public class DemoDatabase {
    public static void main(String[] args){
        // Create a new database object
Database d = new Database();
// Create some CD and DVD objects
CD cd1 = new CD("Vivaldi concertos", "Giuliano Carmignola", 12, 60);
DVD dvd1 = new DVD("Seven Samurai", "Akira Kurosawa", 185);
CD cd2 = new CD("Schubert sonata in A", "Radu Lupu", 6, 35);
DVD dvd2 = new DVD("La Belle et la Bete", "Jean Cocteau", 120);
// Populate the database with the newly created CDs and DVDs
d.addCD(cd1);
d.addCD(cd2);
d.addDVD(dvd1);
d.addDVD(dvd2);
// List the contents of the database
d.list();

// Test the accessor and mutator methods for field genre in CD and DVD
cd1.setGenre("Classical");
dvd1.setGenre("Adventure/Drama");
cd1.print();
System.out.println(" Genre: " + cd1.getGenre());
System.out.println();//leave an empty line
dvd1.print();
System.out.println(" Genre: " + dvd1.getGenre());
System.out.println();//leave an empty line


    }

    }
    
