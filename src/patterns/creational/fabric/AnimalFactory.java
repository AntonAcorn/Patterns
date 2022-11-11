package patterns.creational.fabric;

public class AnimalFactory {
    static Animal create(String type) {
        return switch (type) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            case "bird" -> new Bird();
            default -> throw new RuntimeException("Данного типа не существует");
        };
    }
}
