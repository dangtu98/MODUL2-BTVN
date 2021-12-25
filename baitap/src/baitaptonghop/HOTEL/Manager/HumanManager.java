package baitaptonghop.HOTEL.Manager;

import baitaptonghop.HOTEL.Human;
import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Human> humans;

    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    public Human createHuman(){
        System.out.println("nhập tên người");
        String name = scanner.nextLine();
        System.out.println("nhập vào ngày tháng năm sinh");
        String dob = scanner.nextLine();
        System.out.println("nhập vào số idCard");
        String idCard = scanner.nextLine();
        for (Human e : humans){
            if (e.getIdCard().equals(idCard)){
                System.out.println("trùng id , nhập lại");
                return null;
            }
        }
        Human human = new Human(name,dob,idCard);
        humans.add(human);
        return human;
    }

    public void deleteHuman(String idCard){
        Human human = null;
        for (Human h : humans){
            if (h.getIdCard().equals(idCard)){
                human = h;
            }
        }
        boolean check = humans.remove(human);
        if (check){
            System.out.println("xóa thành công");
        }else {
            System.out.println("xóa không thành côn");
        }
    }

    public void displayHuman(String idCard){
        Human human = null;
        for (Human h : humans){
            if (h.getIdCard().equals(idCard)){
                human = h;
            }
        }
        if (human != null){
            System.out.println(human);
        }else {
            System.out.println("số idCard không tồn tại");
        }
    }

    public void displayAllHuman(){
        for (Human human : humans){
            System.out.println(human);
        }
    }

    public Human getHuman(String idCard){
        Human human = null;
        for (Human h : humans){
            if (h.getIdCard().equals(idCard)){
                human = h;
            }
        }
        return human;
    }
}
