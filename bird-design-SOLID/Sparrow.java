public class Sparrow extends Bird implements Flyable,MakeSound{

    final FlyBehaviour flyBehaviour;
    public Sparrow(String name, String type, String color, double weight, FlyBehaviour flyBehaviour) {
        super(name, type, color, weight);
        this.flyBehaviour = flyBehaviour;
    }

    @Override
    public void fly() {
        flyBehaviour.fly(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Chup Chup");
    }
}
