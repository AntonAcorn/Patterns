package patterns.creational.fabric;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Dog says woof");
    }
}
