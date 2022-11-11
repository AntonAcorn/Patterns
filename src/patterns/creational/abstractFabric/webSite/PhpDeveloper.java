package patterns.creational.abstractFabric.webSite;

import patterns.creational.abstractFabric.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
