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
public class Book extends Library {

    private boolean isRequested;

    public Book(String title, String author, String ID, boolean loan, boolean isRequested) {
        super(title, author, ID, loan);
        this.isRequested = isRequested;
    }

    public void printDetails() {
        System.out.println("Title: " + title
                + "\nAuthor: " + author_artist + "\nItem ID: " + itemID);
        if (onLoan) {
            System.out.println(title + " is on loan");
        } else {
            System.out.println(title + " is not on loan");
        }
        System.out.println("The due date is "+dueDate);
        if (isRequested) {
            System.out.println("The book is requested by others.");
        } else {
            System.out.println("The book is not requested by others.");
        }
        System.out.println();
    }

}
