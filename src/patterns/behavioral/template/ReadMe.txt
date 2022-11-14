Определение основы класса и создание возможности подклассам переопределять его части

Defining the base of a class and allowing subclasses to override parts of it

В Абстрактном классе есть абстрактные методы для реализации в наследниках,
а также общий метод, который и является шаблоном


public abstract class...
 //метод шаблон
public void showPage(){
        System.out.println("Header");   //действие шаблон
        showPageContent();              //реализация наследника
        System.out.println("Footer");   // действие шаблон
    }

     public abstract void showPageContent(); //отдельная реализация для каждого наследника