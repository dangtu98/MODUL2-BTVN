package BT2012;

public class Cat extends Animal implements Animalproperties{

    public Cat() {
        super(name, age, weight);
    }

    public Cat(String name, int age, double weight) {
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
