package BT2012.Model;

import BT2012.My_Interface.AnimalMethor;

public class Cat extends  Animal implements AnimalMethor {
    public Cat() {
    }

    public Cat(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 40;
    }

    @Override
    public String makeSound() {
        return "Meo meo";
    }

    public void catchMouse(){
        System.out.println("biết bắt chuột");
    }

    @Override
    public String toString() {
        return "Cat{"+ super.toString()+"}";
    }
}
