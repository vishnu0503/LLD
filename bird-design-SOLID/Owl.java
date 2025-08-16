public class Owl extends Bird implements Flyable {
    public Owl(String name, String type, String color, double weight) {
        super(name, type, color, weight);
    }

    @Override
    public void fly() {
        System.out.println(name+" fly silently");
    }

}
