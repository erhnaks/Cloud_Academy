import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Array_Project1 {
    public static void main(String[] args) {
//        int value1;
//        int value2;
//        int value3;
//        int value4;
//        int value5;
//
//        ArrayList<Integer> num = new ArrayList<>(5);
//
//        System.out.println("Please enter five Integer: ");
//
//        Scanner scan = new Scanner(System.in);
//        value1 = scan.nextInt();
//        value2 = scan.nextInt();
//        value3 = scan.nextInt();
//        value4 = scan.nextInt();
//        value5 = scan.nextInt();
//
//        num.add(value1);
//        num.add(value2);
//        num.add(value3);
//        num.add(value4);
//        num.add(value5);
//
//        for (int doubled : num) {
//            doubled *= 2;
//
//            System.out.println(doubled);
//        }

        // Better way of doing this is;

        Scanner scan = new Scanner(System.in);
        int[] someValue = new int[5];

        for (int i = 0; i < someValue.length; i++) {
            System.out.println("Please enter five integer: ");

            someValue[i] = scan.nextInt();

        } // end of for


        for (int i = 0; i < someValue.length; i++) {
            System.out.println("result is " + (someValue[i] * 2));
        }


    } //end of main
}
