package abc;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageCandy {
    private ArrayList<Candy> candies;
    private Scanner sc = new Scanner(System.in);

    public ManageCandy() {
        this.candies = new ArrayList<>();
    }

    public void displayAll(Candy candy) {
        for (Candy c : candies) {
            System.out.println(c);
        }
    }

    public Candy createCandy(Scanner sc) {
        System.out.println("nhập vào màu kẹo");
        String color = sc.nextLine();
        System.out.println("nhập vào tính chất");
        String tc = sc.nextLine();
        System.out.println("nhập vào số lượng");
        int sl = sc.nextInt();
        System.out.println("nhập vào đơn giá");
        double dg = sc.nextDouble();
        sc.nextLine();
        return new Candy(color, tc, sl, dg);
    }

    public void addCandy(Candy candy) {
        candies.add(candy);
        System.out.println(candy);
    }

    public void deleteCandyID(int id) {
        Candy candy = null;
        for (Candy e : candies) {
            if (e.getId() == id) {
                candy = e;
            }
        }
        int index = candies.indexOf(candy);
        candies.remove(index);
    }

    public Candy editCandyId(int id) {
        Candy candy = null;
        for (Candy h : candies) {
            if (h.getId() == id) {
                candy = h;
            }
        }
        if (candy != null) {
            int index = candies.indexOf(candy);
            System.out.println("nhập màu mới");
            String color = sc.nextLine();
            candy.setMauSac(color);
            System.out.println("nhập mới tc ");
            String tc = sc.nextLine();
            candy.setTinhChat(tc);
            System.out.println("nhập mới Sl");
            int sl = sc.nextInt();
            candy.setSoLuong(sl);
            System.out.println("nhập mới ĐG");
            double dg = sc.nextDouble();
            candy.setDonGia(dg);
            sc.nextLine();
            candies.set(index, candy);
        }
        return candy;
    }

    public void displayCandyId(int id) {
        Candy candy = null;
        for (Candy h : candies) {
            if (h.getId() == id) {
                candy = h;
            }
        }
        if (candy != null) {
            System.out.println(candy);
        } else {
            System.out.println("không có id trên");
        }
    }

    public ArrayList<Candy> deleteCandyColor(String color) {
        ArrayList<Candy> candy1 = new ArrayList<>();
        for (Candy e : candies) {
            if (e.getMauSac().equals(color)) {
                candy1.add(e);
            }
        }
        candies.removeAll(candy1);
        return candy1;
    }

    public ArrayList<Candy> dissplayCandyColor(String color) {
        ArrayList<Candy> candy2 = new ArrayList<>();
        for (Candy e : candies) {
            if (e.getMauSac().equals(color)) {
                candy2.add(e);
            }
        }
        System.out.println(candy2);
        return candy2;
    }

    public ArrayList<Candy> maxDg(){
        ArrayList<Candy> candy3 = new ArrayList<>();
        double maxdg = 0;
        for (Candy c : candies){
            if (c.getDonGia() > maxdg){
                maxdg = c.getDonGia();
            }
        }
        for (Candy d : candies){
            if (d.getDonGia() == maxdg){
                candy3.add(d);
            }
        }
        System.out.println(candy3);
        return candy3;
    }

    public void dissPlayCandyPrice(String color){
        color = sc.nextLine();
        double total = 0;
        for (Candy candy : candies){
            if (candy.getMauSac().equals(color)){
                total = (candy.getSoLuong() * candy.getDonGia());
            }
        }
        System.out.println(total);
    }

}
