package patterns.creational.abstractFabric.webSite;

import patterns.creational.abstractFabric.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
