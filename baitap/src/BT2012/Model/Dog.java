package BT2012.Model;

import BT2012.My_Interface.AnimalMethor;

public class Dog extends Animal implements AnimalMethor {
    public Dog() {
    }

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 60;
    }

    @Override
    public String makeSound() {
        return "gâu gâu";
    }

    public void Eats(){
        System.out.println("đang ăn xương");
    }

    @Override
    public String toString() {
        return " Dog{"+ super.toString()+"}";
    }
}
