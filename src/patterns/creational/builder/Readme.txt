Отделить конструирование сложного объекта от его представления, чтобы в результате одного и тоже конструирования, мы могли
получить разные представления. Используется для создания различных объектов из одного набора данных.

Separate the construction of a complex object from its representation, so that as a result of the same construction,
we can get different views. Used to create different objects from the same data set.

1) Сам класс Website c полями имя, цена и cms. и СЭТЕРАМИ для них
2) Создаем сущность, которая будет все конструировать. websiteBuilder (абстрактный класс).
    главные поля  WebSite webSite;
                   WebSite website;
                    void createWebSite() {
                !!!      webSite = new WebSite();    !!!
                     }

                     abstract void buildName();

                     abstract void buildCms();

                     abstract void buildPrice();

                     WebSite getWebSite(){
                         return webSite;
                     }
3) Создаем конкретный сайт который наследуется от websiteBuilder в нем:
         @Override                          \\ метод от буилдера, а внутри метод от общего сайта
            void buildName() {
                webSite.setName("VisitCard");
            }
4) Класс Director определяет, какой именно нужно создать сайт
                public class Director {
                    WebSiteBuilder builder;

                    public void setBuilder(WebSiteBuilder builder) {
                        this.builder = builder;
                    }

                    WebSite buildWebSite(){
                        builder.createWebSite();
                        builder.buildName();
                        builder.buildCms();
                        builder.buildPrice();

                        WebSite webSite = builder.getWebSite();
                        return webSite;
                    }
5) В клиенте

                            Director director = new Director();

                            director.setBuilder(new EnterpriceWebSiteBuilder()); \\ кладем наследника абстрактного класса

                            WebSite webSite = director.buildWebSite();

                            System.out.println(webSite);