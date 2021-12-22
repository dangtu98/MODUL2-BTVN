package BT22_12;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerHuman {
    private ArrayList<Human> humans;
    private Scanner scanner = new Scanner(System.in);

    public ManagerHuman()
    {
        this.humans = new ArrayList<>();
    }

    public void displayALL(){
        for (Human e : humans){
            System.out.println(e);
        }
    }

    public Human CreateHuman(){
        System.out.println("nhập vào tên");
        String ten = scanner.nextLine();
        System.out.println("nhập tuổi");
        String tuoi = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gt = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String dc = scanner.nextLine();
        return new Human(ten,tuoi,gt,dc);
    }

    public void addHuman(Human human){
        humans.add(human);
        System.out.println(humans);
    }

    public ArrayList<Human> displayNam(String gt){
       ArrayList <Human> human1 = new ArrayList<>();
       for (Human e : humans){
           if (e.getGioitinh().equals(gt)){
               human1.add(e);
           }
       }
        System.out.println(human1);
       return human1;
    }

    public ArrayList<Human> displayNu(String gt){
        ArrayList <Human> human2 = new ArrayList<>();
        for (Human c : humans){
            if (c.getGioitinh().equals(gt)){
                human2.add(c);
            }
        }
        System.out.println(human2);
        return humans;
    }

    public ArrayList<Human> displayAge(String age){
        ArrayList <Human> human3 = new ArrayList<>();
        for (Human a : humans){
            if (a.getTuoi().equals(age)){
                human3.add(a);
            }
        }
        System.out.println(human3);
        return human3;
    }


    public Human deleteHuman(String ten){
        Human human = null;
        for (Human e : humans){
            if (e.getTen().equals(ten)){
                human = e;
            }
        }
        int index = humans.indexOf(human);
        humans.remove(index);
        return human;
    }


    public Human editHuman(String ten){
        Human human = null;
        for (Human e : humans){
            if (e.getTen().equals(ten)){
                human = e;
            }
        }
        if (human  != null){
            int index = humans.indexOf(human);
            System.out.println("nhập tên mới");
            String ten1 = scanner.nextLine();
            human.setTen(ten1);
            System.out.println("nhập tuổi mới");
            String age = scanner.nextLine();
            human.setTuoi(age);
            System.out.println("nhập giới tính");
            String gt1 = scanner.nextLine();
            human.setGioitinh(gt1);
            System.out.println("Nhập địa chỉ");
            String dc1 = scanner.nextLine();
            human.setDiachi(dc1);
            humans.set(index,human);
        }
        return human;
    }


}
