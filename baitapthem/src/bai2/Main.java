package bai2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----MENU----");
            System.out.println("Lựa Chọn Loại Quả Muốn Tạo");
            System.out.println("1.Quả Táo");
            System.out.println("2.Quả Chuối");
            System.out.println("3.Quả Chanh");
            System.out.println("4.Hiện thị tất cả các loại quả");
            System.out.println("5.Hiện thị loại quả theo loại");
            System.out.println("6.hiển thị loại quả có giá cao nhất");
            System.out.println("7.Hiển Thị với 1tr đồng mua được quả nhiều nhất là");
            choice = scanner.nextInt();
            switch (choice){
                case 1 :
                    Fruit apple = manager.createApple();
                    manager.addApple((Apple) apple);
                    break;
                case 2:
                    Fruit banana = manager.createBanana();
                    manager.addBanana((Banana) banana);
                    break;
                case 3:
                    Fruit lemon = manager.createLemon();
                    manager.addLemon((Lemon) lemon);
                    break;
                case 4:
                    manager.displayFruitALL();
                    break;
                case 5:
                    int choice1;
                    do{
                        System.out.println("---Chọn hiện thị quả theo loại---");
                        System.out.println("1.Hiển thị toàn bộ quả táo");
                        System.out.println("2.Hiển thị toàn bộ quả chuối");
                        System.out.println("3.Hiển thị toàn bộ quả chanh");
                        System.out.println("0.Exit");
                        choice1 = scanner.nextInt();
                        switch (choice1){
                            case 1:
                                manager.displayApple();
                                break;
                            case 2:
                                manager.displayBanana();
                                break;
                            case 3:
                                manager.displayLemon();
                                break;
                        }
                    }while (choice1 !=0);
                case 6:
                    System.out.println("Giá Fruit nhất là  " + manager.maxFruit());
                    break;
                case 7:
                    System.out.println(manager.displayOneMillion());
                    break;
            }

        }while (choice !=0);

    }
}
