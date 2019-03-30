


package ru.avalon.java.dev.j10.labs.commons;

public class Address{           // Объявлен класс Адрес.
    private int index; // Объявление полей(переменных) класса - индекс
    private String country; // страна
    private String region;       // регион-область
    private String city;          // город
    private String street;          // улица
    private String home;              // дом
    private int flat;                     // квартира

    public Address(int index, String country, String region, String city,
            String street, String home, int flat) // Обьявлен конструктор для инициализации переменных класса Адрес. 
    {
       
        this.index = index; // Индекс
        this.country = country; // Страна
        this.region = region;  // Регион-область
        this.city = city;  // Город
        this.street = street; // Улица
        this.home = home; // Дом
        this.flat = flat;  // Квартира
        /*  TODO (Проверка№2 ЛР№1)
            - Добавить коментарии ко всем  полям и методам класса, а то я к примеру не пойму,
            что такое flat!????
        */
        
        /*  TODO (Проверка№3 ЛР№1)
            - В даном коде ошибка, найти и исправить! Такое чувство что ты откуда-то копируешь просто!
            И не образаешь внимание на код!
            - Добавить коментарии ко всем методам класса - это означает надо описать действие метода,
            а не описывать его устройство, нас интересует что он может делать.
            Например: нахождение максимального числа, получение поля index!
            Конструкторы и гетеры тоже надо подписывать, сразу становиться ясно что он делает!
            - Ставь комментарии перед конструкторами и методами, тогда они легче читаются!
        */
        
       } 
        
      public Address(int index, String country, String city, // Конструктор исключающий поле класса region.
            String street, String home, int flat){
      this(index, country, null, city, street, home, flat);
      } 
      
      
      public Address(String country, String city, // Конструктор исключающий поле класса region и index.
            String street, String home, int flat){
      this(0, country, null, city, street, home, flat);
      } 
      
    public int getIndex() { // Обьявление методов получения значений полей из класса - индекс
        return index;
    }

    public int getFlat() { // Обьявление методов получения значений полей из класса - квартира
        return flat;
    }

    public String getCountry() { // Обьявление методов получения значений полей из класса - страна
        return country;
    }

    public String getRegion() { // Обьявление методов получения значений полей из класса - область
        return region;
    }
    

    public String getCity() { // Обьявление методов получения значений полей из класса - город
        return city;
    }

    public String getStreet() { // Обьявление методов получения значений полей из класса - улица
        return street;
    }

    public String getHome() { // Обьявление методов получения значений полей из класса - дом
        return home;
    }
}
