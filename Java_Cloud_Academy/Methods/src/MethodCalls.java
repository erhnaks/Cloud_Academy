public class MethodCalls {

    public static void main(String[] args) {

        doSomething();
    } // end of main

    public static void doSomething() {

        System.out.println("In doSomething");
        int result = getSomeValue();

        System.out.println("result is " + result);


    }
    public static int getSomeValue() {
        return 150;
    }
}
