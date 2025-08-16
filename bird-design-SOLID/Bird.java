public abstract class Bird {
    public String name;
    public String type;
    public String color;
    public double weight;

    public Bird(String name, String type, String color, double weight) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public void eat()
    {
        System.out.println(name+" is eating");
    }
    public void dance()
    {
        System.out.println(name+" is dancing");
    }


}
