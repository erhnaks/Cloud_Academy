import java.util.Scanner;
import java.util.ArrayList;

public class Parallel_Arrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        String name;
        int age;

        for (int i = 0; i < 5; i++) {

            System.out.println("Please enter your name: ");
            name = scan.nextLine();

            System.out.println("Please Enter your age: ");
            age = scan.nextInt();
            //consuming new line;
            scan.nextLine();

            names.add(name);
            ages.add(age);
            System.out.println();

        }// end of for loop

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old.");
        }


    } // end of main


}
