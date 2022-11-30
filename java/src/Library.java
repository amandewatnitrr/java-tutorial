import java.util.*;

public class Library {
    public static void add_book(){
        Product book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book -> ");
        String name = sc.nextLine();
        book.setName(name);
        System.out.print("Enter the author of the book -> ");
        String auth = sc.nextLine();
        ((Book) book).setAuthor(auth);
        System.out.print("Enter ISBN of the book -> ");
        String isbn = sc.nextLine();
        ((Book) book).setIsbn(isbn);
        show_book((Book)book);
    }

    public static void show_book(Book book){
        System.out.println("Book Name -> " + book.getName());
        System.out.println("Book Author -> " + book.getAuthor());
        System.out.println("Book ISBN -> " + book.getIsbn());
    }
}
