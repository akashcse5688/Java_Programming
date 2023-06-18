import java.util.InputMismatchException;
import java.util.Scanner;

public class library implements Admin {
    static String BookName;
    static String IssiueDate;
    static String ReturnDate;
    static int BookId, TotalIssiueBook;

    public void addBook() {
        double price = 0;
        int bookNo = 0;
        //Add any book

        System.out.print("Enter the book name: ");
        Scanner obj2 = new Scanner(System.in);
        String BookName = obj2.nextLine();


        for (int i = 0; i < 100; i++) {
            try {
                System.out.print("Enter Price : ");
                price = obj2.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n--Input Mistake try again--");
                obj2.nextLine();
            }
        }

        for (int i = 0; i < 100; i++) {
            try {
                System.out.print("Book No :");
                bookNo = obj2.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n--Input Mistake try again--");
                obj2.nextLine();
            }
        }

        System.out.println("Your details--\nBook Name :" + BookName + "\nPrice :" + (price * bookNo) + "\nBook No :" + bookNo);
    }

    public void issueBook() {
        //issue any Book
        Scanner obj3 = new Scanner(System.in);
        System.out.print("Book name : ");
        BookName = obj3.nextLine();
        System.out.print("Issue date : ");
        IssiueDate = obj3.nextLine();
        System.out.print("Return book date : ");
        ReturnDate = obj3.nextLine();

        for (int i = 0; i < 100; i++) {
            try {
                System.out.print("Book id : ");
                BookId = obj3.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n--Input Mistake try again--");
                obj3.nextLine();
            }
        }

        for (int i = 0; i < 100; i++) {
            try {
                System.out.print("Total number of book Issued : ");
                TotalIssiueBook = obj3.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n--Input Mistake try again--");
            }
        }
    }


    public void returnBOOK() {
        int bookId = 0;
        //return Any book
        Scanner c = new Scanner(System.in);

        System.out.print("Enter the Student Name : ");
        String name = c.nextLine();

        for (int i = 0; i < 100; i++) {
            try {
                System.out.print("Enter Book Id : ");
                 bookId = c.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\n--Input Mistake try again--");
                c.nextLine();
            }
        }

        if (BookId == bookId) {
            System.out.println("Total Details --");
            System.out.println("Book Name : " + library.BookName);
            System.out.println("Book Id : " + library.BookId);
            System.out.println("Issue Date : " + library.IssiueDate);
            System.out.println("Total number of book Issued : " + library.TotalIssiueBook);
            System.out.println("Book return date : " + library.IssiueDate);
        } else {
            System.out.println("Wrong id ,please Enter correct id");
        }

    }

    public void detail() {
        //All details
        System.out.println("Total Details --");
        System.out.println("Book name : " + library.BookName);
        System.out.println("Book id : " + library.BookId);
        System.out.println("Issue date : " + library.IssiueDate);
        System.out.println("Total number of book Issued : " + library.TotalIssiueBook);
        System.out.println("Book return date : " + library.ReturnDate);
    }

    public void exit() {
        System.exit(0);
    }

}