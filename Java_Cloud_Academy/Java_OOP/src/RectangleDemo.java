public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        Rectangle r3;

        r3 = new Rectangle(2.5, 3);


        System.out.println(Rectangle.getNumberRectangles());

        System.out.println(r3.area());

        System.out.println();

        System.out.println("The length is " + r2.getLength() + " the width is " + r2.getWidth() + " with an area" +
                " of " + r2.area());


    }// end of main
}// end of RectangleDemo
