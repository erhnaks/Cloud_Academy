import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {

        int input;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your integer number: ");
        input = scan.nextInt();

        if (input % 3 == 0) {

            System.out.println(input + " is divisible by 3");
        } else {
            System.out.println(input + " is not divisible by 3");
        }


    } // end of main
}
