package BT16_12;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class HumanManager implements Manager {
    private ArrayList<Human> humans;
    private final Scanner scanner = new Scanner(System.in);


    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    @Override
    public void disPlayAll() {
        for (Human human : humans) {
            System.out.println(human);
        }
    }


    public Human createHuman(Scanner scanner, int choice) {
        scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập vào tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1){
            return new Human(name,age);
        }else if (choice == 2){
            System.out.println("nhập vào điểm trung bình");
            double average = scanner.nextDouble();
            return new Human(name ,age,average);
        }
        return null;
    }

    @Override
    public void addHuman(Human human) {
           humans.add(human);
    }

    @Override
    public Human searchHumanId(int id) {
        Human human = null;
        for (Human e : humans) {
            if (e.getId() == id) {
                human = e;
            }
        }
        System.out.println(human);
        return human;
    }

    @Override
    public Human deleteHumanId(int id) {
        Human human = null;
        for (Human e : humans){
            if (e.getId() == id){
                human = e;
            }
        }
        humans.remove(human);
        return human;
    }

    @Override
    public Human editHumanId(int id) {
        Human human = null;
        Student students = null;
        for (Human h : humans){
            if (h.getId() == id && h instanceof Student){
                students = (Student) h;
            }else if (h.getId() == id){
                human = h;
            }
        }
        if (human != null){
            System.out.println("Nhập tên mới");
            String name = scanner.nextLine();
            if (name.equals("")){
                human.setName(human.getName());
            }else {
                human.setName(name);
            }
            System.out.println("nhập tuổi mới");
            human.setAge(scanner.nextInt());
            scanner.nextLine();
            return human;
        }else if (students != null){
            System.out.println("nhập tên mới ");
            students.setName(scanner.nextLine());
            System.out.println("nhập tuổi mới ");
            students.setAge(scanner.nextInt());
            System.out.println("nhập điểm mới");
            students.setAveragePoint(scanner.nextDouble());
            scanner.nextLine();
            return students;
        }
       return  null;
    }

    @Override
    public void sortByAverages() {
     ArrayList<Student> students = new ArrayList<>();
     ArrayList<Human> humans1 = new ArrayList<>();
     for (Human human : humans){
         if (human instanceof Student){
             students.add((Student) human);
         }else {

             humans1.add(human);
         }
     }

     students.sort(new Comparator<Student>() {
         @Override
         public int compare(Student o1, Student o2) {
             if (o1.getAveragePoint() < o2.getAveragePoint()){
                 return 1;
             }else if (o1.getAveragePoint() > o2.getAveragePoint()){
                 return  -1;
             }else {
                 return 0;
             }
         }
     });
    }

    @Override
    public double totalAverages() {
        double totalPoint = 0;
        int count = 0;
        for (Human human : humans) {
            if (human instanceof Student) {
                totalPoint += ((Student) human).getAveragePoint();
                count++;
            }
        }
        return totalPoint/count;
    }
}
