import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {

    public static void main(String[] args) throws FileNotFoundException {


        try {
            PrintWriter pw = new PrintWriter("output.txt");

            pw.println("Hello World!");
            pw.println("This is Erhan");

            pw.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File is not found");
            System.out.println(ex.getMessage());
        }


    }// end of main


}
