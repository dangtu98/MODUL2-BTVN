package BT16_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanManager humanManager = new HumanManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do{
            System.out.println("MENU");
            System.out.println("1. Hiển thị tất cả list");
            System.out.println("2. Thêm 1 người");
            System.out.println("3. Sửa 1 người theo id");
            System.out.println("4. Xóa 1 người theo id");
            System.out.println("5. Tìm 1 người theo id");
            System.out.println("6. Sắp xếp list theo điểm trung bình");
            System.out.println("7. Tính tổng điểm");
            System.out.println("8. Tính trung bình của tất cả học sinh");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice){
                case  1:
                    humanManager.disPlayAll();
                    break;
                case 2:
                    int choice1;
                    do{
                        System.out.println("1.Người");
                        System.out.println("2.Sinh viên");
                        System.out.println("Nhập lựa chọn của bạn");
                        choice1 = scanner.nextInt();
                        switch (choice1){
                            case 1:
                                Human human = humanManager.createHuman(scanner , choice1);
                                humanManager.addHuman(human);
                                break;
                            case 2:
                                Student student = (Student) humanManager.createHuman(scanner,choice1);
                                humanManager.addHuman(student);
                                break;
                        }
                    }while (choice1 != 0);

                case 3:
                    System.out.println("nhập id người muốn sửa");
                    int idEdit  = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(humanManager.editHumanId(idEdit));
                    break;
                case 4:
                    System.out.println("nhập id người muốn xóa");
                    int idDelete = scanner.nextInt();
                    System.out.println(humanManager.deleteHumanId(idDelete));
                    break;
                case 5:
                    System.out.println("nhập id người muốn tìm");
                    int idSearch = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(humanManager.searchHumanId(idSearch));
                    break;
                case 6:
                    humanManager.sortByAverages();
                    break;
                case 7:
                    System.out.println("tổng điểm là :");
                    System.out.println(humanManager.totalAverages());
                    break;

            }
        }while (choice != 0);
    }
}
