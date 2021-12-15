package Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);
        Book [] books = new Book[9];
        books [0] = new Book("A", 10000 , 10 , "12/12/2021");
        books [1] = new Book("B", 20000 , 20 , "12/12/2021");
        books [2] = new Book("C", 30000 , 30 , "12/12/2021");
        books [3] = new Sciencebook("D", 40000 , 40 , "12/12/2021" , "java");
        books [4] = new Sciencebook("E", 50000 , 50 , "12/12/2021", "PHP");
        books [5] = new Sciencebook("F", 60000 , 60 , "12/12/2021" , "JS");
        books [6] = new Novelbook("G", 70000 , 70 , "12/12/2021" , "tu");
        books [7] = new Novelbook("H", 80000 , 80 , "12/12/2021","trung");
        books [8] = new Novelbook("J", 90000 , 90 , "12/12/2021","huy");

        ManagerBook managerBooks = new ManagerBook();
        managerBooks.displayAllBook(books);
        managerBooks.sumPrice(books);
        managerBooks.maxBookPrice(books);
        managerBooks.minimBookPrice(books);
        System.out.println("nhập vào thể loại muốn tìm");
        String type = scanner.nextLine();
        managerBooks.searchBytype(books,type);
        System.out.println("nhập vào tác giả muốn tìm");
        String name = scanner.nextLine();
        managerBooks.searchByauthors(books,name);





    }
}
