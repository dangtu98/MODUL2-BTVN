package bai2;

import java.util.ArrayList;
import java.util.Scanner;


public class Manager {
    private ArrayList<Fruit> fruits;
    private Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.fruits = new ArrayList<>();
    }

    public Apple createApple() {
        System.out.println("Nhập cân nặng Apple");
        double weigth = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhập vị quả apple");
        String taste = scanner.nextLine();
        System.out.println("nhập màu quả apple");
        String color = scanner.nextLine();
        System.out.println("nhập giá quả apple");
        double price = scanner.nextDouble();
        return new Apple(weigth , taste , color ,price);
    }
    public Banana createBanana() {
        System.out.println("Nhập cân nặng Banana");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhập vị quả banana");
        String taste = scanner.nextLine();
        System.out.println("nhập màu quả banana");
        String color = scanner.nextLine();
        System.out.println("nhập giá quả banana");
        double price = scanner.nextDouble();
        return new Banana(weight , taste , color ,price);
    }
    public Lemon createLemon() {
        System.out.println("Nhập cân nặng Lemon");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhập vị quả Lemon");
        String taste = scanner.nextLine();
        System.out.println("nhập màu quả Lemon");
        String color = scanner.nextLine();
        System.out.println("nhập giá quả Lemon");
        double price = scanner.nextDouble();
        return new Lemon(weight , taste , color ,price);
    }


    public void addApple(Apple apple){
        fruits.add(apple);
    }
    public void addBanana(Banana banana){
        fruits.add(banana);
    }
    public void addLemon(Lemon lemon){
        fruits.add(lemon);
    }

    public void displayFruitALL(){
        for (Fruit fruit : fruits){
            System.out.println(fruit);
        }
    }

    public void displayApple(){
        for (Fruit fr: fruits) {
            if (fr instanceof Apple){
                System.out.println(fr);
            }
        }
    }
    public void displayBanana(){
        for (Fruit fr1 : fruits){
            if (fr1 instanceof Banana){
                System.out.println(fr1);
            }
        }
    }

    public void displayLemon(){
        for (Fruit fr2 : fruits){
            if (fr2 instanceof Lemon){
                System.out.println(fr2);
            }
        }
    }

    public double maxFruit(){
        double maxPrice = 0;
        for (Fruit e : fruits){
            if (e.getPrice() > maxPrice){
                maxPrice = e.getPrice();
            }
        }
        return maxPrice;
    }

    public ArrayList <Fruit> displayOneMillion(){
        ArrayList <Fruit> fruit1 = new ArrayList<>();
        for (Fruit f : fruits){
            if (f.getPrice() < 1000000){
                fruit1.add(f);
            }
        }
        return fruit1;
    }

}
