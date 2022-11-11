package patterns.creational.abstractFabric.webSite;

import patterns.creational.abstractFabric.Developer;
import patterns.creational.abstractFabric.ProjectManager;
import patterns.creational.abstractFabric.ProjectTeamFactory;
import patterns.creational.abstractFabric.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
