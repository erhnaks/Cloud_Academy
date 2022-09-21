import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int input;


        System.out.println("Enter a positive number");
        System.out.println("Enter a negative number to exit!");

        input = scan.nextInt();

        while(input > 0){
            System.out.println(input + " is a positive number");

            System.out.println("Enter a positive number");
            System.out.println("Enter a negative number to exit!");

            input = scan.nextInt();

        }
        System.out.println("Done!");



//        int count = 0;

//        while (count < 10) {
//            System.out.println(count);
//            count++;
//        }

//        int count2 = 0;
//
//        do{
//            System.out.println(count2);
//            count2++;
//        }
//        while(count2 <10);



//    for (int i=0; i < 10; i++){
//        System.out.println(i);
//    }

    }
}