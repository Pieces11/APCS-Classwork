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
public class CD extends Library {

    private String gengre;

    public CD(String title, String author, String ID, boolean loan, String gengre) {
        super(title, author, ID, loan);
        this.gengre = gengre;
    }
    public void printDetails() {
        System.out.println ("Title: "+title + 
                "\nArtist: " + author_artist + "\nItem ID: " + itemID );
        if(onLoan)
            System.out.println(title+" is on loan");
        else
            System.out.println(title+" is not on loan");
        System.out.println("The due date is "+dueDate);
        System.out.println("Gengre: "+gengre);
        System.out.println();
    }
}
