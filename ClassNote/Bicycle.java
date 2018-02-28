/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

/**
 *
 * @author Du
 */
public class Bicycle {

    private double maxSpeed;
    private double distance;
    private double price;

    public Bicycle(double n) {
        maxSpeed = 20;
        distance = n;
        price=2;
    }

    public double timeNeeded() {
        double time = distance / maxSpeed;
        return time;
    }

    public double payment() {
        double pay = distance / maxSpeed * price;
        return pay;
    }
}
