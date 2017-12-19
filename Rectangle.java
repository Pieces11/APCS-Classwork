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
public class Rectangle {
    private int width;
    private int length;
    
    public Rectangle(int w,int l){
       this.width=w;
       this.length=l;
    } 
    public int getArea(){
        return this.width*this.length;
    }
    
     public int getPerimeter(){
        return 2*(this.width+this.length);
    }
}
