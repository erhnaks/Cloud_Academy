import java.util.Scanner;
import java.util.ArrayList;

public class WorkingWithArrayList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Double> myList = new ArrayList<>();


        double input;

        System.out.println("Enter 0 or more to put in the Array list or -1 to exit!");

        input = scan.nextDouble();

        while (input >= 0) {
            myList.add(input);
            System.out.println("Enter 0 or more to put in the Array list or -1 to exit!");
            input = scan.nextDouble();
        }// end of while


        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));

        }


    } // end of main


}
