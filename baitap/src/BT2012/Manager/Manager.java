package BT2012.Manager;

import BT2012.Model.Animal;
import BT2012.Model.Cat;
import BT2012.Model.Dog;
import BT2012.Model.Mouse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Manager {
    HashMap<String, Animal> animals = new HashMap<>();
    Scanner scanner = new Scanner(System.in);


    public boolean addAnimal(int choice) {
        System.out.println("tên mới :  ");
        String name = scanner.nextLine();
        System.out.println("tuổi mới:  ");
        int age = scanner.nextInt();
        System.out.println("cân nặng : ");
        int weight = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1:
                Animal animal = new Animal(name , age , weight);
                return checkName(animal);
            case 2:
                Dog dog = new Dog(name , age , weight);
                 return checkName(dog);
            case 3:
                Cat cat = new Cat(name , age , weight);
                return checkName(cat);
            case 4:
                Mouse mouse = new Mouse(name , age , weight);
               return checkName(mouse);
        }
        return false;
    }

    public boolean checkName(Animal animal) {
        HashSet<String> strings = new HashSet<>(animals.keySet());
        if (strings.add(animal.getName())) {
            animals.put(animal.getName(), animal);
            return true;
        }else {
            return false;
        }
    }

    public  Animal deleteAnimal(String name){
        return animals.remove(name);
    }

//    public void displayAnimal(String name){
//        animals.get(name).display();
//    }

}
