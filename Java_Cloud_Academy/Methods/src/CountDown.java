public class CountDown {

    public static void main(String[] args) {

        countDownFrom(10);

    } // end of main

    public static void countDownFrom(int num) {
        if (num >= 0) {
            System.out.println(num);
            countDownFrom(num - 1);
        } else {
            System.out.println("DONE!");
        }
    }

}

