public class Penguin extends Bird implements MakeSound{

    public Penguin(String name, String type, String color, double weight) {
        super(name, type, color, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Creep Creep");
    }
}
