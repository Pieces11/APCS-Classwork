/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SusieHello;

/**
 *
 * @author Susie 
 * This is the main class for my Hello World program
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person Susie = new Person("English");
        Person Judy = new Person("French");
        Person Kirsten = new Person("German");
        Person Lizzy = new Person("Spanish");
        Person Rebecca = new Person("Chinese");
        
        Susie.grow(4);
        Judy.grow(5);
        Kirsten.grow(8);
        Lizzy.grow(85);
        
        Susie.grade(4.0);
        Judy.grade(0);

        System.out.println(Judy.sayHello());
        System.out.println(Lizzy.sayHello());
        System.out.println(Kirsten.sayHello());
        System.out.println(Rebecca.sayHello());
        System.out.println(Susie.sayHello());
        
        System.out.println(Susie.evaluate());
        System.out.println(Judy.evaluate());
    }

}
