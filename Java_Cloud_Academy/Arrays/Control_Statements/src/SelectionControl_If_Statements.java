import java.util.Scanner;

public class SelectionControl_If_Statements {

    public static void main(String[] args) {

        int age;

        System.out.println("Welcome to the Adana Kebab Aile Salonu");
        System.out.println("Please Enter your age: ");

        Scanner scan = new Scanner(System.in);

        age = scan.nextInt();

        System.out.println();
        if (age >= 21) {
            System.out.println("Here, hava a beer and Adana");
        } else if (age >= 16) {
            System.out.println("Here, have a Coke! ");
            System.out.println("At least you can drive");
        } else {
            System.out.println("Here, have a Coke!");
        } // end of If


    } // end of main

}
