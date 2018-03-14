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
public abstract class Shape {

public abstract double getArea();
public abstract double getPerimeter();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rng=new Random();
       Circle c= new Circle(rng.nextDouble());
       System.out.println(c.getArea());
       System.out.println(c.getPerimeter());
       
       Square r=new Square(rng.nextInt());
       System.out.println(Math.abs(r.getArea()));
       System.out.println(r.getPerimeter());
       
       Triangle t=new Triangle(3,5,7,4);
        System.out.println(t.getArea());
       System.out.println(t.getPerimeter());
       System.out.println(t.toString());
    }
    
}
