import java.util.Scanner;

public class LibraryManagement {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String bookName;
        String author;
        int bookId;

        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        bookName = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        System.out.println("\n----- Library Record -----");
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Status : Available");
    }
}