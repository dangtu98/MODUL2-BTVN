package baitaptonghop.Tiendien;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Manager {
    HashMap<Integer, Bill> bills;
    Scanner scanner = new Scanner(System.in);

    public Manager(String path) throws IOException, ClassNotFoundException{
        bills = readBillFromFile(path);
    }

    public HashMap<Integer, Bill> getBills(){
        return bills;
    }

    public boolean addBill(){
        System.out.println("Nhập vào tên chủ hộ");
        String name = scanner.nextLine();
        System.out.println("nhập vào số nhà");
        int home = scanner.nextInt();
        System.out.println("nhập vào mã số công tơ");
        int idElec = scanner.nextInt();
        System.out.println("Nhập vào chỉ số cũ");
        int olddex = scanner.nextInt();
        System.out.println("nhập vào chỉ số mới");
        int newdex = scanner.nextInt();
        scanner.nextLine();
        if (olddex <= newdex){
            Bill bill = new Bill(name,home,idElec,olddex,newdex);
            return checkIdElectricOfBill(bill);
        }
        return false;
    }

    private boolean checkIdElectricOfBill(Bill bill){
        HashSet<Integer> integers = new HashSet<>(bills.keySet());
        if (integers.add(bill.getIdElectric())){
            bills.put(bill.getIdElectric(),bill);
            return true;
        }else {
            return false;
        }
    }
    public void displayAll(){
        for (Bill bill : bills.values()){
            System.out.println(bill);
        }
    }

    public void getElectricBillByIdElectric(int idElectric){
        Bill bill = null;
        for (Bill bill1 : bills.values()){
            if (bill1.getIdElectric() == idElectric){
                bill = bill1;
            }
        }
        if (bill == null){
            System.out.println("không tìm thấy !");
        }else {
            System.out.println("gia đình ông/bà" + bill.getName() + "phải thanh toán");
            System.out.println(bill.getIdElectric());
        }
    }
    public void writeBillToFile(HashMap<Integer, Bill> bills, String pathName) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(pathName));
        objectOutputStream.writeObject(bills);
        objectOutputStream.close();
        System.out.println("Write successfully!");
    }

    public HashMap<Integer, Bill> readBillFromFile(String pathName) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathName));
        return (HashMap<Integer, Bill>) objectInputStream.readObject();
    }


}
