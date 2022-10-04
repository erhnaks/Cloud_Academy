import java.util.Random;

public class TwoDArrays {

    public static void main(String[] args) {


        int[][] my2DArray = new int[2][3];

        fill2DArray(my2DArray);

        print2DArray(my2DArray);


    } // end of main

    public static void fill2DArray(int[][] twoDArr) {
        Random random = new Random();

        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] = random.nextInt(100); // 0 .... 99 inclusive
            }
        }


    } // end of fill2DArray

    public static void print2DArray(int[][] twoDArr) {

        for (int[] arr : twoDArr) {
            for (int num : arr) {
                System.out.print(num + " ");
            } //end of inner for loop
            System.out.println();
        }


    } // end print2DArray


}
