package patterns.temp;

public class Radio implements ElectricityConsumer {
    public void playMusic(){
        System.out.println("Playing music");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
