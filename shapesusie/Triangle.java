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
public class Triangle extends Shape {

    private int base;
    private int side1;
    private int side2;
    private int height;

    public Triangle(int b, int h, int x, int y, String name) {
        super(name);
        base = b;
        height = h;
        side1 = x;
        side2 = y;
    }

    public double getArea() {
        return this.base * this.height / 2;
    }

    public double getPerimeter() {
        return base + side1 + side2;
    }

}

