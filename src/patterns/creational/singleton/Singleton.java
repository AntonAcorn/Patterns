package patterns.creational.singleton;

public class Singleton {

}

class Sun {
    private static Sun instance;

    public static Sun getInstance(){
        if(instance == null){
            instance = new Sun();
        }
        return instance;
    }
    private Sun() {
    }
}
