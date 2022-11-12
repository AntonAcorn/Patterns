package patterns.behavioral.chain;

public class EmailNotifyer extends  Notifier{
    public EmailNotifyer(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending Email: " + message);
    }
}
