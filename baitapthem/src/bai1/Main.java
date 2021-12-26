package bai1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerLaptop managerLaptop = new ManagerLaptop();
        int choice;
        do{
            System.out.println("--*--=MENU=--*--");
            System.out.println("1.Nhập vào thông tin Laptop");
            System.out.println("2.Hiện thị tất cả các loại Laptop");
            System.out.println("3.Sửa thông tin Laptop");
            System.out.println("4.Xóa thông tin Laptop");
            System.out.println("5.Tìm laptop theo Hãng");
            System.out.println("6.Tìm laptop theo khoảng giá ");
            System.out.println("7.Tìm laptop theo mã id");
            System.out.println("8.Tìm laptop theo màu");
            System.out.println("0.Exit");
            System.out.println("----------Chọn Menu----------");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    Laptop st = managerLaptop.createLaptop();
                    managerLaptop.addLaptop(st);
                    break;
                case 2:
                    managerLaptop.displayAll();
                    break;
                case 3:
                    try{
                        System.out.println("nhập vào id của máy ");
                        int id1 = scanner.nextInt();
                        Laptop s = managerLaptop.editLaptop(id1);
                        if (s == null){
                            System.out.println("khồng có id này");
                        }else {
                            System.out.println(s);
                        }
                        break;
                    }catch (Exception e){
                        System.out.println("Nhập sai thông tin sản phẩm");
                    }
                case 4:
                    try {
                        System.out.println("nhập id của máy");
                        int id2 = scanner.nextInt();
                        Laptop a = managerLaptop.deleteLaptop(id2);
                        if (a == null){
                            System.out.println("không có id này");
                        }else {
                            System.out.println(a);
                        }
                        break;
                    }catch (Exception e){
                        System.out.println("nhập dữ liệu không đúng !!! ");
                    }
                case 5:
                    try{
                        scanner.nextLine();
                        System.out.println("nhập hãng máy");
                        String name = scanner.nextLine();
                        ArrayList<Laptop> h = managerLaptop.displayLaptopName(name);
                        if (h == null){
                            System.out.println("không có hãng máy này");
                        }else {
                            System.out.println(h);
                        }
                        break;
                    }catch (Exception e){
                        System.out.println("Nhập sai thông tin !!!");
                    }

                case 6:
                    try{
                        System.out.println("nhập vào giá máy");
                        double price = scanner.nextDouble();
                        ArrayList<Laptop> e = managerLaptop.searchLaptopPrice(price);
                        System.out.println(e);
                        break;
                    }catch (Exception e){
                        System.out.println("nhập sai thông tin");
                    }
                case 7:

                        System.out.println("nhập vào id của máy");
                        int id3 = scanner.nextInt();
                        Laptop w = managerLaptop.searchLaptopID(id3);
                        System.out.println(w);
                        break;
                case 8:
                        scanner.nextLine();
                        System.out.println("nhập màu máy");
                        String color1 = scanner.nextLine();
                        ArrayList <Laptop> c = managerLaptop.searchLaptopColor(color1);
                        if (c == null){
                            System.out.println("không có màu máy này");
                        }else {
                            System.out.println(c);
                        }
                        break;
            }
        }while (choice != 0);
    }
}
