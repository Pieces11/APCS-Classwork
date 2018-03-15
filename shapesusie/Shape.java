/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesusie;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Du
 */
public abstract class Shape{
public String name;

public Shape(String name)
{this.name=name;
}
public abstract double getArea();

public abstract double getPerimeter();

public String toString(){
return"Shape("+this.name+")";
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rng=new Random();
       Circle c= new Circle(rng.nextDouble(),"c");
       System.out.println(c.getArea());
       System.out.println(c.getPerimeter());
       
       Square r=new Square(rng.nextInt(),"r");
       System.out.println(Math.abs(r.getArea()));
       System.out.println(r.getPerimeter());
       
       Triangle t=new Triangle(3,5,7,4,"t");
        System.out.println(t.getArea());
       System.out.println(t.getPerimeter());
       System.out.println(t.toString());
       
       Circle a=new Circle(3,"a");
       Circle b=new Circle(7,"b");
       
       List d=new ArrayList();
       d.add(a);
       d.add(b);
       d.add(c);
       Collections.sort(d);
       System.out.println(d);
       
    }
   
}
