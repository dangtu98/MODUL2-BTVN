package BT2012;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Manager {
    private Set<Animal> animalSet;


    public Manager(Set<Animal> animalSet) {
        this.animalSet = animalSet;
    }

    public Manager() {
        this.animalSet = new HashSet<>();
    }

    public void addAnimal(Animal animals){
        this.animalSet.add(animals);
    }

    public static Animal createAnimal(Scanner sc) {
            System.out.println(" Nhập tên con vật: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println(" nhập tuổi con vật: ");
            int age = sc.nextInt();
            System.out.println(" nhập cân nặng con vật: ");
            double weight = sc.nextDouble();
            return new Animal(name, age, weight);

    }

}
