public class BookDemo {
    public static void main(String[] args) {

        Book Java = new Book("Erhan", "Learn Java With Me!", "Education", 290);

        Book MySQL = new Book("Mike", "Hello MySQL", "Education", 336);

        Java.printBookDetails();
        MySQL.printBookDetails();


//        printBook(Java);
//        printBook(MySQL);


    } // end of bookDemo

//    public static void printBook(Book book) {
//
//        System.out.println("The Author of this book is " + book.getAuthor() + " and the title is " + book.getTitle()
//                + " It's genre is " + book.getGenre() + ", and has " + book.getNumPages() + " pages. Enjoy reading!");
//
//        System.out.println();
//
//
//    }// end of print book

}
