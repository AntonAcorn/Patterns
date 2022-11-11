package patterns.creational.abstractFabric.webSite;

import patterns.creational.abstractFabric.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("ManualTester tests website...");
    }
}
