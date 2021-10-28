package capitulo03;

public class BookTestDrive {

    public static void main(String[] args) {

        Book b = new Book();
        Book c = new Book();

        b = c;
        c = null;

        Book[] books = new Book[3];
        int x = 0;

        Book book1 = new Book();
        book1.title = "The Grapes of Java";
        book1.author = "Bob";

        Book book2 = new Book();
        book2.title = "The Java Gatsby";
        book2.author = "Sue";

        Book book3 = new Book();
        book3.title = "The Java Cookbook";
        book3.author = "Ian";

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        while (x < 3) {
            System.out.print(books[x].title);
            System.out.print(" by ");
            System.out.println(books[x].author);
            x = x + 1;
        }
    }
}
