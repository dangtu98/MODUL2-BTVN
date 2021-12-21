package BT2012.Model;

import BT2012.My_Interface.AnimalMethor;

public class Mouse extends  Animal implements AnimalMethor {
    public Mouse() {

    }

    public Mouse(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public String toString() {
        return "Mouse{"+ super.toString()+"}";
    }

}
