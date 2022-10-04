

public class MethodsDemo {

    public static void main(String[] args) {

        printHello();
        printNumber(20);
        int result = giveMe10();
        System.out.println(result);


        result = addThese(3, 5);
        System.out.println(result);


    }   // end of main

    // void parameterless method
    public static void printHello() {
        System.out.println("Hello there!");
    }// end of print hello

    //void parameterized method
    public static void printNumber(int a) {
        System.out.println("The number is: " + a);
    } // end of parameterized method

    // value returning, parameterless
    public static int giveMe10() {
        return 10;
    } // end of giveme10

    //value returning parameterized
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    } // end of addThese


} // end of methodsdemo
