/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction.to.Classes.and.Objects;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class ContactMain {

    private static String name;
    private static String number;
    public static void main(String[] args) {
        Contact[] myContacts = new Contact[3];
        
        for (int i = 0; i < 3; i++) {
            name = JOptionPane.showInputDialog("Enter name: ");
            number = JOptionPane.showInputDialog("Enter Phone number:");
            myContacts[i] = new Contact(name, number);
        }
        
        for (Contact myContact : myContacts) {
            System.out.println("Name : " + myContact.getName());
            System.out.println("Number : " + myContact.getNumber());
        }
    }
}
