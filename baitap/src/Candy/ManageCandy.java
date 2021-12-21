package Candy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageCandy {
   private List <Candy> CandyList = new ArrayList<>();


    public Candy addCandy(Scanner scanner){
        System.out.println("nhập mã kẹo");
        int id = scanner.nextInt();
        System.out.println("nhập vào màu");
        scanner.nextLine();
        String color = scanner.nextLine();
        System.out.println("nhập vào loại");
        String type = scanner.nextLine();
        System.out.println("Nhập vào số lượng");
        int quantity = scanner.nextInt();
        System.out.println("nhập vào đơn giá");
        int unit = scanner.nextInt();
        return new Candy(id , color , type , quantity , unit);

    }

    public void displayCandy(){
        System.out.println("hiện thị tất cả kẹo");
        for (Candy candy1 : CandyList){
            System.out.println(candy1);
        }
    }




}
