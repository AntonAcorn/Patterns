Стратегия — это поведенческий паттерн проектирования, который определяет семейство схожих алгоритмов и помещает
каждый из них в собственный класс, после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.

A strategy is a behavioral design pattern that recognizes a family of general algorithms and includes
each of them in its own class, after which the algorithms are interchangeable right
during the execution of the program.

интерфейс Activity -  семейство схожих алгоритмов
Coding, Sleeping, Training - реализации, которые можно взаимозаменять

В этом паттерне должен был быть объект, которому мы устанавливаем стратегию и который выполняет эту стратегию
public class Developer {
    Activity activity;
    public void setActivity(Activity activity) {
            this.activity = activity;
        }
        public void executeActivity(){
            activity.justDoIt();
        }

Developer runner - это клиент, в котором все выполняется:
 Developer developer = new Developer();
        developer.setActivity(new Coding());
        developer.executeActivity();