public class CircleDemo {
    public static void main (String[] args){


        Circle myCircle = new Circle(2.5);

        printCircleData(myCircle);


    } // end of main


    public static void printCircleData(Circle circle){
        System.out.println("r = " + circle.getRadius());
        System.out.println("C = " + String.format("%.2f",circle.circumference())); // print 2 decimal places
        System.out.println("A = " + String.format("%.2f",circle.area()));
        System.out.println();
    }



}
