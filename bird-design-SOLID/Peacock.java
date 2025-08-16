public class Peacock extends Bird implements Flyable,MakeSound{
    public Peacock(String name, String type, String color, double weight) {
        super(name, type, color, weight);
    }

    @Override
    public void fly() {
        System.out.println(name+" can fly only for short distance");
    }

    @Override
    public void makeSound() {
        System.out.println("Peafowl Peafowl");
    }
}
