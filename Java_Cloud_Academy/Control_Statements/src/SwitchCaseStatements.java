import java.util.Scanner;

public class SwitchCaseStatements {
    public static void main(String[] args) {

        String grade;

        System.out.println("Please enter your grade: ");

        Scanner scan = new Scanner(System.in);

        grade = scan.next();

        switch (grade) {
            case "A", "a" -> System.out.println("Grade A, Excellent");
            case "B", "b" -> System.out.println("Grade B, Fantastic.");
            case "C", "c" -> System.out.println("Grade C, Please study more");
            case "D", "d" -> System.out.println("Grade D, You have failed!");
            default -> System.out.println("invalid Grade!");
        }


    } //end of main
}
