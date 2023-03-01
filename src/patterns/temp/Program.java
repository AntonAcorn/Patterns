package patterns.temp;

public class Program {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Radio radio = new Radio();
        Switcher sw = new Switcher();
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);
        sw.addElectricityListener(
                () -> System.out.println("Fire!")
        );

        //eventSubscribe
        sw.switchOn();
    }
}
