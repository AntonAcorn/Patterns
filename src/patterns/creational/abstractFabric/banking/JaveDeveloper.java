package patterns.creational.abstractFabric.banking;

import patterns.creational.abstractFabric.Developer;

public class JaveDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper writes Java code...");
    }
}
