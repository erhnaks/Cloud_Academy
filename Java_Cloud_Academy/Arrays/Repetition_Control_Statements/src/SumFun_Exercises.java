import java.util.Scanner;

public class SumFun_Exercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Please enter your first number to add or enter a negative number to exit!");
        num1 = scan.nextInt();
        System.out.println("Please enter your second number:");
        num2 = scan.nextInt();

        while (num1 > 0) {
            System.out.println(num1 + num2);

            System.out.println("Please enter your first number to add:");
            num1 = scan.nextInt();
            System.out.println("Please enter your second number:");
            num2 = scan.nextInt();
        }
        System.out.println("Done!");

    } //end of main


}
