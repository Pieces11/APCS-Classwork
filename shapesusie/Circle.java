/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesusie;

/**
 *
 * @author Du
 */
public class Circle extends Shape implements Comparable<Circle> {

    private double radius;
    private static final double PI = 3.14;

    public Circle(double r, String name) {
        super(name);
        radius = r;

    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return PI * 2 * this.radius;
    }

    public int compareTo(Circle a) {
        return (int) (this.radius - (a.radius));
    }


    
}
