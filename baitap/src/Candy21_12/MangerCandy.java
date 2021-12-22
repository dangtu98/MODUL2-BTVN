package Candy21_12;

import java.util.ArrayList;
import java.util.Scanner;

public class MangerCandy {
    private ArrayList <Candy> candies;
    private Scanner scanner = new Scanner(System.in);

    public MangerCandy() {
        this.candies = new ArrayList<>();
    }

    public void displayAll(){
        for (Candy candy : candies){
            System.out.println(candy);
        }
    }

    public Candy createCandy(){
        System.out.println("nhập màu kẹo");
        String color = scanner.nextLine();
        System.out.println("nhập tính chất kẹo");
        String property = scanner.nextLine();
        System.out.println("nhập số lượng kẹo");
        int quantity = scanner.nextInt();
        System.out.println("nhập giá kẹo");
        int amount = scanner.nextInt();
        scanner.nextLine();
        return new Candy(color , property , quantity ,amount);
    }

    public void addCandy(Candy candy){
        candies.add(candy);
        System.out.println(candy);
    }

    public Candy deleteCandy(int id){
        Candy candy = null;
        for (Candy e : candies){
            if (e.getId() == id){
                candy = e;
            }
        }
        int index = candies.indexOf(candy);
        return candies.remove(index);
    }

    public Candy editCandy(int id){
        Candy candy = null;
        for (Candy h : candies){
            if (h.getId() == id){
                candy = h;
            }
        }
        if (candy != null){
            int index = candies.indexOf(candy);
            System.out.println("nhập màu mới");
            String color = scanner.nextLine();
            candy.setColor(color);
            System.out.println("nhập tính chất mới");
            String property = scanner.nextLine();
            candy.setProperty(property);
            System.out.println("nhập số lượng mới");
            int quantity = scanner.nextInt();
            candy.setQuantity(quantity);
            System.out.println("nhập giá mới");
            int amount = scanner.nextInt();
            candy.setAmount(amount);
            scanner.nextLine();
            candies.set(index,candy);
        }
        return candy;
    }
   public void displayCandyId(int id){
        Candy candy = null;
        for (Candy h : candies){
            if (h.getId() == id){
                candy = h;
            }
        }
        if (candy != null){
            System.out.println(candy);
        }else {
            System.out.println("không có viên kẹo nào theo id");
        }
   }
   public ArrayList<Candy> deleteColor(String color){
        ArrayList<Candy> candy1 = new ArrayList<>();
        for (Candy e : candies){
            if (e.getColor().equals(color)){
                candy1.add(e);
            }
        }
        candies.removeAll(candy1);
        return candy1;
   }
   public ArrayList<Candy> displayAllColor(String color){
        ArrayList <Candy> candy2 = new ArrayList<>();
        System.out.println("nhập vào màu");
        for (Candy e : candies){
            if (e.getColor().equals(color)){
                candy2.add(e);
            }
        }
        System.out.println(candy2);
       return candy2;
   }
   public ArrayList<Candy> maxAmount(){
        ArrayList <Candy> candy3 = new ArrayList<>();
        double maxAmount = 0;
        for (Candy c : candies){
            if (c.getAmount() > maxAmount){
                maxAmount = c.getAmount();
            }
        }
        for (Candy d : candies){
            if (d.getAmount() == maxAmount){
                candy3.add(d);
            }
        }
       System.out.println(candy3);
       return candy3;
   }

   public void dissplayPrice(String color){
       color = scanner.nextLine();
       double total = 0;
       for (Candy e : candies){
           if (e.getColor().equals(color)){
               total = e.getQuantity() * e.getAmount();
           }
       }
       System.out.println(total);
   }

}
