package patterns.creational.builder;

public class VisitCardWebSiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("VisitCard");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(100);
    }
}
