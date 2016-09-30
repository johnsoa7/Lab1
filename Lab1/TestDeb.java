package testdeb;

/**
 * Tests Deb class.
 *
 * @author Ian T. Nabney, modified by M. Chli
 * @version 1.1 (29 Sep 2006)
 */

public class TestDeb {
    public static void main(String[] args) {
		Deb testObject;
		testObject = new Deb();
                testObject.allocate();
		testObject.set(1,20);
		testObject.set(0,10);
		testObject.set(3,50);		
		testObject.set(2,60);
    }
}

