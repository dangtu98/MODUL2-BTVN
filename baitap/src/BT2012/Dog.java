package BT2012;

public class Dog extends  Animal implements Animalproperties{

    public Dog() {
        super(name, age, weight);
    }

    public Dog(String name, int age, double weight) {
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
