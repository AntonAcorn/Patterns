package patterns.creational.abstractFabric.banking;

import patterns.creational.abstractFabric.Developer;
import patterns.creational.abstractFabric.ProjectManager;
import patterns.creational.abstractFabric.ProjectTeamFactory;
import patterns.creational.abstractFabric.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
