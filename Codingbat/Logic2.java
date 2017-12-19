/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat;

/**
 *
 * @author Du
 */
public class Logic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static boolean makeBricks(int small, int big, int goal) {
        return (small >= (goal % 5) && (small + big * 5 >= goal));
    }

    public static int loneSum(int a, int b, int c) {
        if (a == b) {
            if (a == c) {
                return 0;
            }
            return c;
        }
        if (a == c) {
            return b;
        }
        if (b == c) {
            return a;
        }
        return (a + b + c);
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return (a + b);
        }
        return (a + b + c);
    }
}
