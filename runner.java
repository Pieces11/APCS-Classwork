/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesusie;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Du
 */
public class runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rng=new Random();
       circle c= new circle(rng.nextDouble());
       System.out.println(c.getArea());
       System.out.println(c.getCircumference());
       
       Rectangle r=new Rectangle(rng.nextInt(),rng.nextInt());
       System.out.println(r.getArea());
       System.out.println(r.getPerimeter());
    }
    
}
