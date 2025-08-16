import java.util.ArrayList;
import java.util.List;

public class BirdDemo {
    public static void main(String[] args) {
//
//        Bird crow=new Crow("Crow","Small","Black",1);
//        crow.eat();
//        crow.dance();
//
//        Bird sparrow=new Sparrow("Sparrow","Small","Brown",1.5);
//        sparrow.eat();
//        sparrow.dance();
//
//        Bird owl=new Owl("Owl","Medium","Black",1);
//        owl.eat();
//        owl.dance();
//
//        Bird peacock=new Peacock("Peacock","Large","Blue",3);
//        peacock.eat();
//        peacock.dance();
//
//        Bird penguin=new Penguin("Penguin","Large","Black",20);
//        penguin.eat();
//        penguin.dance();
        // To crete a simple fly behaviour
        FlyBehaviour flyBehaviour=new SimpleFlyBehaviour();
        // To create List of Birds
        List<Bird> birds = List.of(
                new Crow("Crow","Small","Black",1,flyBehaviour),
                new Sparrow("Sparrow","Small","Brown",1.5,flyBehaviour),
                new Owl("Owl","Medium","Black",1),
                new Peacock("Peacock","Large","Blue",3),
                new Penguin("Penguin","Large","Black",20)
        );

        // To create List of Flyable Birds
        List<Flyable> flyableBirdsList=new ArrayList<>();
        List<MakeSound> makeSoundBirdsList=new ArrayList<>();
        for(Bird bird:birds)
        {
            bird.eat();
            bird.dance();
            if(bird instanceof Flyable) {
                flyableBirdsList.add((Flyable)bird);
                ((Flyable) bird).fly();
            }
            if(bird instanceof MakeSound)
            {
                makeSoundBirdsList.add((MakeSound)bird);
                ((MakeSound) bird).makeSound();
            }
        }

        // Print list of Flyable birds
        System.out.println("Fyable birds are below");
        for(Flyable bird:flyableBirdsList)
            System.out.println(((Bird)bird).name);

        // Print list of sound making birds
        System.out.println("Sound making birds are below");
        for(MakeSound bird:makeSoundBirdsList)
            System.out.println(((Bird)bird).name);
    }
}
