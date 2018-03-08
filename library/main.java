/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Date;
/**
 *
 * @author Du
 */
public class main {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Library b = new Book("12 Rules for Life","Jordan Peterson", "X123", false,true);
       b.printDetails();
         b.borrowing("Susie", "xxx@gmail.com", 123);
         b.printDetails();
       
       
        Library cd = new CD("And Justice for all", "Metallica", "X567", false,"Metal");
        cd.printDetails(); 
        
        
    }    
    
    
}
