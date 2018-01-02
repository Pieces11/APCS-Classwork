/*
Susie Du - Class AP C8
Instructor: Daniel Gunn
2017/10/18
 */
package pkg11.pkg15;

import java.util.Arrays;

/**
 *
 * @author Du
 */
public class SusieSort {

    /**
     * @param args the command line arguments
     */
    public static void insertion_sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                }
            }
        }
    }

    public static void selection_sort(int[] arr) {
        int i, j;
        for (i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }

    public static void main(String[] args) {
        int[] unsorted = {5, 20, 1, 15, 2, 7};
        insertion_sort(unsorted);
        System.out.println(Arrays.toString(unsorted));
    }

}
