package patterns.behavioral.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();
    }
}
