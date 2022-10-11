import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Input_Fun {
    public static void main(String[] args) {


        Scanner infile;

        try {
            infile = new Scanner(new File("input.txt"));

            int input;
            int sum = 0;

            while (infile.hasNext()) {
                input = infile.nextInt();
                System.out.println(input);
                sum += input;
            }

            System.out.println("Sum is: " + sum);
            infile.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
            System.out.println(ex.getMessage());
        } // end of try-catch statement


    } // end of main
}

