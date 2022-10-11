import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {

        Scanner inFile;
        PrintWriter pw;

        try {
            inFile = new Scanner(new File("nums.txt"));

            pw = new PrintWriter("twiceNum.txt");

            int inputNum;

            while (inFile.hasNext()) {
                inputNum = inFile.nextInt();
                inputNum *= 2;

                pw.println(inputNum);

            }
            inFile.close();
            pw.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File is not found!");
            System.out.println(ex.getMessage());
        }


    } // end of main
}
