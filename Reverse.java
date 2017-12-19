/*
Susie Du - Class AP C8
Instructor: Daniel Gunn
2017/10/18
 */
package pkg10.pkg31;

import java.util.Scanner;

/**
 *
 * @author Du
 */
public class Reverse {

    public static void rev(String s) {
        if (s.length() > 0) {
            rev(s.substring(1));
            System.out.print(s.substring(0, 1));
        }
    }

    public static int rev(int a) {
        if (a < 10) {
            return a;
        } else {
            System.out.print(a % 10);
            return rev(a / 10);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an input: ");
        System.out.println(rev(input.nextInt()));
    }

}
