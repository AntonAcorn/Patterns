Создание объекта в единственном экземпляре

Creating an object in a single instance

1)Создать приватный статический экземпляр класс (без инициализации)
2)Создать публичный статический метод, возвращающий экземпляр
3)Если instance == null, то возвращаем instance = new...
4)Else возвращаем instance
5)Создать приватный конструктор по умолчанию

1)Create a private static instance of the class (no initialization)
2)Create a public static method that returns an instance
3)If instance == null, then return instance = new...
4)Else return instance
5)Create a private default constructor