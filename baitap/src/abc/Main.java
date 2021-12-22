package abc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageCandy manageCandy1 = new ManageCandy();
        int choice;
        do{
            System.out.println("MENU");
            System.out.println("1.Hiện thị all kẹo");
            System.out.println("2.Hiện thị thêm viên kẹo");
            System.out.println("3.Xóa viên kẹo theo ID");
            System.out.println("4.Sửa viên kẹo theo ID");
            System.out.println("5.Hiển thị viên kẹo theo ID");
            System.out.println("6.Xóa viên kẹo theo màu");
            System.out.println("7.Hiện thị viên kẹo theo màu");
            System.out.println("8.Tìm viên kẹo đơn giá cao");
            System.out.println("9.Tính giá kẹo theo màu");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    manageCandy1.displayAll();
                    break;
                case 2:
                    Candy candy = manageCandy1.createCandy();
                    manageCandy1.addCandy(candy);
                    break;
                case 3:
                    System.out.println("nhập id muốn xóa");
                    int id = scanner.nextInt();
                    Candy candy1 = manageCandy1.deleteCandyID(id);
                    if (candy1 == null){
                        System.out.println("không có id tương ứng");
                    }else {
                        System.out.println(candy1);
                    }
                    break;
                case 4:
                    System.out.println("nhập id muống sửa");
                    int idEdit = scanner.nextInt();
                    Candy candy2 = manageCandy1.editCandyId(idEdit);
                    if (candy2 == null){
                        System.out.println("không có id tương ứng");
                    }else {
                        System.out.println(candy2);
                    }
                    break;
                case 5:
                    System.out.println("nhập vào id muốn hiển thị");
                    int idDissplay = scanner.nextInt();
                    Candy candy3 = manageCandy1.displayCandyId(idDissplay);
                    if (candy3 == null){
                        System.out.println("không có id");
                    }else {
                        System.out.println(candy3);
                    }
                    break;
                case 6:
                    System.out.println("nhập vào màu muốn xóa");
                    String color = scanner.nextLine();
                    ArrayList <Candy> cs = manageCandy1.deleteCandyColor(color);
                    System.out.println(cs);
                    break;
                case 7:
                    System.out.println("hiện thị viên kẹo theo màu");
                    String colorPlayer = scanner.nextLine();
                    ArrayList<Candy> css1 =manageCandy1.dissplayCandyColor(colorPlayer);
                    System.out.println(css1);
                    break;
                case 8:
                    ArrayList <Candy> cs1 = manageCandy1.maxDg();
                    System.out.println(cs1);
                    break;
                case 9:
                    System.out.println("nhập màu muốn tính giá thành");
                    String clo = scanner.nextLine();
                    manageCandy1.dissPlayCandyPrice(clo);
                    break;
            }
        }while (choice !=0);
    }
}
