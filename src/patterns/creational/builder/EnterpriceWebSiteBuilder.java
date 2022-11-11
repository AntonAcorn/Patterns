package patterns.creational.builder;

public class EnterpriceWebSiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Enterprise WebSite");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
