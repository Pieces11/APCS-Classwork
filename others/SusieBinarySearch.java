/*
Susie Du - Class AP C8
Instructor: Daniel Gunn
2017/10/18
 */
package pkg11.pkg14;

/**
 *
 * @author Du
 */
public class SusieBinarySearch {

    public static int binary_search(int[] arr, int value) {
        int low = 0;
        int hi = arr.length - 1;

        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                low = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
int[]search={5,7,13,25,28,34,37,43,49};
System.out.println(binary_search(search,34));
    }
}
