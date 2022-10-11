import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class NamesAges {

    public static void main(String[] args) {

        Scanner namesFile;
        Scanner agesFile;

        PrintWriter pw;

        try {

            namesFile = new Scanner(new File("names.txt"));
            agesFile = new Scanner(new File("age.txt"));
            pw = new PrintWriter("namesandages.txt");

            String tempName;
            int tempAge;

            while (namesFile.hasNext()) {
                tempName = namesFile.nextLine();
                tempAge = agesFile.nextInt();

                pw.println(tempName + " is " + tempAge + " years old.");

            } // end of while

            namesFile.close();
            agesFile.close();
            pw.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File is not found!");
            System.out.println(ex.getMessage());
        }

    } // end of main

}
