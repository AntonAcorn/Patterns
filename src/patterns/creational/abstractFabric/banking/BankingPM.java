package patterns.creational.abstractFabric.banking;

import patterns.creational.abstractFabric.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
