package Book;

import java.util.Scanner;

public class ManagerBook {
    public Book [] createBook(Scanner scanner){
        System.out.println("nhập vào số lượng quyển sách");
        int size = scanner.nextInt();
        Book [] books = new Book[size];
        return  books;
    }

    public void displayAllBook(Book[] books){
        System.out.println("hiện thị tất cả các loại sách là");
        for(Book book1 : books ){
            System.out.println(book1);
        }
    }

    public void sumPrice(Book[] books){
        System.out.println("tổng giá tất cả các loại sách là :");
        int sumPricebooks = 0;
        for (Book book1 : books){
            sumPricebooks += (book1.getPrice() * book1.getQuantity());
        }
        System.out.println(sumPricebooks);
    }
    public void maxBookPrice(Book [] books){
        System.out.println("giá tiền sách cao nhất là :");
        int maxPrice = books[0].getPrice();
        for (int i = 0 ; i <= books.length ; i++ ){
            if(books[i].getPrice() > maxPrice){
                maxPrice = books[i].getPrice();
            }

        }
        System.out.println(maxPrice);
    }
    public void  minimBookPrice(Book[] books){
        System.out.println("giá tiền sách thấp nhất là :");
        int minPrice = books[0].getPrice();
        for(int i = 0 ; i <= books.length ; i++){
            if (minPrice > books[i].getPrice()){
                minPrice = books[i].getPrice();
            }
        }
        System.out.println(minPrice);
    }

    public void searchBytype(Book[] books , String searchtype){
        boolean check = false;
        for(int i = 0 ; i < books.length ; i++){
            if (books[i] instanceof Sciencebook){
                if (((Sciencebook)books[i]).getType().equals(searchtype)){
                    check = true;
                    System.out.println(books[i]);
                }
            }
        }
        if(!check){
            System.out.println("không có quyển sách thể loại đó");
        }
    }

    public  void searchByauthors(Book[] books , String searchauthor){
        boolean check = false;
        for (int i = 0 ; i <= books.length ; i++){
            if ( books[i] instanceof Novelbook){
                if (((Novelbook)books[i]).getAuthor().equals(searchauthor)){
                    check = true;
                    System.out.println(books[i]);
                }
            }
        }
        if(!check){
            System.out.println("không có tên tác giả nào");
        }
    }

    public void avangeByScienBook(Book[] books){
        long avange = 0;
        int count = 0;
        for(int i = 0 ; i < books.length ; i++){
            if (books[i] instanceof  Sciencebook){
                avange += books[i].getPrice();
                count++;
            }
        }
        System.out.println("trung bình đơn giá của sách khoa học là");
        System.out.println(avange/count);
    }

}
