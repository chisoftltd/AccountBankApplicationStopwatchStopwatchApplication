/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction.to.Classes.and.Objects;

import java.util.Scanner;


/**
 *
 * @author 1609963
 */
public class Name {

    private static int age;
    private static String name;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter Name and Year of Birth");
        //name = new Scanner(System.in).next();
        //age = new Scanner(System.in).nextInt();
        
        Person person = new Person(new Scanner(System.in).next(), new Scanner(System.in).nextInt());
 
        System.out.println("Name : " + person.getName());
        System.out.println("Year of birth : " + person.getYear());
        System.out.println("Age now : " + person.getAge(2016));
        System.out.println("Person detail : " + person.toString());
    }

}
