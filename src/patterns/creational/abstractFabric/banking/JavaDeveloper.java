package patterns.creational.abstractFabric.banking;

import patterns.creational.abstractFabric.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("JavaDeveloper writes Java code...");
    }
}
