/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Du
 */
public class Library {

    String title;
    String author_artist;
    String itemID;
    boolean onLoan;
    Date dueDate;

    public Library(String title, String author, String ID, boolean loan) {
        this.title = title;
        author_artist = author;
        itemID = ID;
        onLoan = loan;
    }

    public void printDetails() {
        System.out.println("Title: " + title
                + "\nAuthor/artist: " + author_artist + "\nItem ID: " + itemID);
        if (onLoan) {
            System.out.println(title + " is on loan");
        } else {
            System.out.println(title + " is not on loan");
        }

    }

    public static Date addDays(Date date, int days) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }

    public void borrowing(Borrower b) {
        if (onLoan) {
            System.out.println("Sorry, " + title + " is on loan.");
            System.out.println();
        } else {
            onLoan = true;
            Date today = new Date();
            dueDate = addDays(today, 14);
            System.out.println("You have borrowed this item.");
            System.out.println("Borrower name: " + b.borrowerName + " Email: " + b.emailAddress + " ID: " + b.borrowerID);
            System.out.println("The due date is " + dueDate);
            b.UpdateItemsOnLoan(1);
            b.GetItemsOnLoan();
            System.out.println();
        }

    }

    public void returning(Borrower b) {
        System.out.println("You have returned this item.");
        b.UpdateItemsOnLoan(-1);
        this.onLoan = false;
        b.GetItemsOnLoan();
        System.out.println();
    }

}
