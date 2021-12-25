package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerLaptop {
    private ArrayList<Laptop> laptops;
    private Scanner sc = new Scanner(System.in);

    public ManagerLaptop() {
        this.laptops = new ArrayList<>();
    }

    public Laptop createLaptop() {
        System.out.println("nhập vào hãng máy");
        String name = sc.nextLine();
        System.out.println("nhập vào màu sắc của máy");
        String color = sc.nextLine();
        System.out.println("nhập vào giá tiền của máy");
        double price = sc.nextDouble();
        System.out.println("nhập vào số lượng của máy");
        int quantity = sc.nextInt();
        sc.nextLine();
        return new Laptop(name, color, price, quantity);
    }


    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }



    public Laptop deleteLaptop(int id) {
        Laptop laptop = null;
        for (Laptop e : laptops) {
            if (e.getId() == id) {
                laptop = e;
            }
        }
        int index = laptops.indexOf(laptop);
        return laptops.remove(index);
    }



    public Laptop editLaptop(int id) {
        Laptop laptop = null;
        for (Laptop e : laptops) {
            if (e.getId() == id) {
                laptop = e;
            }
        }
        if (laptop != null) {
            int index = laptops.indexOf(laptop);
            System.out.println("nhập hãng máy mới");
            String name = sc.nextLine();
            laptop.setName(name);
            System.out.println("nhập vào màu sắc");
            String color = sc.nextLine();
            laptop.setColor(color);
            System.out.println("nhập vào giá tiền");
            double price = sc.nextDouble();
            laptop.setPrice(price);
            System.out.println("nhập vào số lượng");
            int quantity = sc.nextInt();
            laptop.setQuantity(quantity);
            sc.nextLine();
            laptops.set(index, laptop);
        }
        return laptop;
    }

    public void displayAll() {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    public ArrayList<Laptop> displayLaptopName(String name) {
        ArrayList<Laptop> laptop1 = new ArrayList<>();
        for (Laptop e : laptops) {
            if (e.getName().equals(name)) {
                laptop1.add(e);
            }
        }
        return laptop1;
    }

    public ArrayList<Laptop> searchLaptopPrice(double price) {
        ArrayList<Laptop> laptop2 = new ArrayList<>();
        for (Laptop e : laptops) {
            if (e.getPrice() == price) {
                laptop2.add(e);
            }
        }
        return laptop2;
    }

    public Laptop searchLaptopID(int id) {
        Laptop laptop = null;
        for (Laptop e : laptops) {
            if (e.getId() == id) {
                laptop = e;
            }
        }
        return laptop;
    }

    public ArrayList<Laptop> searchLaptopColor(String color) {
        ArrayList<Laptop> laptop3 = new ArrayList<>();
        for (Laptop e : laptops) {
            if (e.getColor().equals(color)) {
                laptop3.add(e);
            }
        }
        return laptop3;
    }


}
