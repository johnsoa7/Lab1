/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BasicPackage;

import java.util.Calendar;

/**
 *
 * @author johnsoa7
 */
public class Basic { 
    public static void main(String[] args)
    {
        String outString = "Hello trees. It is ";
        Calendar timeNow = Calendar.getInstance();
       System.out.println(outString + timeNow.getTime());
       
    }
   
}


