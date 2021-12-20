package BT2012;

public class Mouse extends Animal implements Animalproperties{

    public Mouse() {
        super(name, age, weight);
    }

    public Mouse(String name, int age, double weight) {
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
}
