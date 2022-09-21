import java.util.Objects;
import java.util.Scanner;

public class Fraternity_Exercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int age;
        String gender;

        System.out.println("Please enter your age:\t ");

        age = scan.nextInt();

        scan.nextLine();

        System.out.println("Now, please enter your gender! M for Male or F for female: ");

        gender = scan.next();

        if (age >= 19 && Objects.equals(gender, "M")) {
            System.out.println("You can join the fraternity");
        } else {
            System.out.println("You can not join !");
        }


    } // end of main
}
