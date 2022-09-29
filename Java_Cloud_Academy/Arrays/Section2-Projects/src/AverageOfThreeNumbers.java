import java.util.Scanner;

public class AverageOfThreeNumbers {


    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner number = new Scanner(System.in);

        System.out.println("Please enter a number! ");

        a = number.nextDouble();

        System.out.println("Please enter your second number! ");

        b = number.nextDouble();

        System.out.println("Please enter a third number! ");

        c = number.nextDouble();

        double average = (a + b + c) / 3.0 ;


        System.out.println("Average of your numbers are " + average);






    } //end of main
}
