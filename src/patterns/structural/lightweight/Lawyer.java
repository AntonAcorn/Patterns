package patterns.structural.lightweight;

public class Lawyer implements Employee {
    public Lawyer() {
        System.out.println("Lawyer hired");
    }

    @Override
    public void work() {
        System.out.println("Solving legal issues...");
    }
}
