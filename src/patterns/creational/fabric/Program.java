package patterns.creational.fabric;

public class Program {
    public static void main(String[] args) {
        Animal cat = AnimalFactory.create("cat");
        Animal dog = AnimalFactory.create("dog");
        Animal bird = AnimalFactory.create("bird");
        cat.voice();
        dog.voice();
        bird.voice();
    }



}
