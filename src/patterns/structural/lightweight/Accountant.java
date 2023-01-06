package patterns.structural.lightweight;

public class Accountant implements  Employee{
    public Accountant() {
        System.out.println("Accountant hired");
    }

    @Override
    public void work() {
        System.out.println("Solving accountant issues...");
    }
}
