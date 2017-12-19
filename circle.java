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
public class circle {

    private double radius;
    private static final double PI=3.14;

    public circle(double r) {
        this.radius = r;
    }
    
    public double getArea(){
        return PI *this.radius*this.radius;
    }
    
    public double getCircumference(){
    return PI*2*this.radius;}
}
