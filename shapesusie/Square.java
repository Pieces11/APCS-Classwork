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
public class Square extends Shape{
   
    private int side;
    
    public Square(int s,String name){
        super(name);
      side=s;
       
    } 
    public double getArea(){
        return side*side;
    }
    
     public double getPerimeter(){
        return 4*side;
    }

}
