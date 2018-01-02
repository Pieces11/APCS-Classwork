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
public class SusieLinearSearch {

    /**
     * @param args the command line arguments
     */
    public static int[] linear_search(int[][] arr, int value) {
        int[] result = {0,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 4) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int search[][] = {{1, 5}, {2, 3, 22, 4, 7}};
        int result[] = linear_search(search, 4);
        System.out.print(result[0] + ",");
        System.out.print(result[1]);
    }

}
