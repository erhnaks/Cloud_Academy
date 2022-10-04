public class MethodsOverloading {

    public static void main(String[] args) {

        int result = getResult(5);
        System.out.println(result);

        result = getResult(5, 6);
        System.out.println(result);

        result = getResult(5, "12");
        System.out.println(result);


    } // end of main

    public static int getResult(int num) {
        return num * 2;
    }

    public static int getResult(int num1, int num2) {
        return num1 * num2;
    }

    public static int getResult(int num1, String value) {
        return num1 * Integer.parseInt(value);
    }


}
