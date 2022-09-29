public class StringMethods_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("John Doe");

        System.out.println(sb);

        sb.append(" is awesome");

        System.out.println(sb);

        sb.insert(5, "Nick ");
        System.out.println(sb);

        sb.replace(17, 25, "amazing");
        System.out.println(sb);

        sb.delete(5, 10);

        System.out.println(sb);

        sb.replace(0, 5, "Dr. ");
        System.out.println(sb);
    } // end of main

}
