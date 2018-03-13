/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Du
 */
public class Borrower {

    String borrowerName;
    String emailAddress;
    int borrowerID;
    int itemsOnLoan;

    public Borrower(String name, String email, int ID) {
        borrowerName = name;
        emailAddress = email;
        borrowerID = ID;
        itemsOnLoan = 0;
    }
    
    public void UpdateItemsOnLoan(int n)
    {
    itemsOnLoan+=n;
   
    }
    public void GetItemsOnLoan()
    {System.out.println("There are "+itemsOnLoan+" items on loan.");
    }
}
