


package ru.avalon.java.dev.j10.labs.commons;

public class Address{           // Объявлен класс.
    private int index;          // Объявление полей(переменных) класса.
    private String country;
    private String region;
    private String city;
    private String street;
    private String home;
    private int flat;

    public Address(int index, String country, String region, String city,
            String street, String home, int flat) // Обьявлен конструктор для инициализации переменных 
    {
       
        this.index = index;
        this.country = country;// Инициализация переменных.
        this.region = region;
        this.city = city;
        this.street = street;
        this.home = home;
        this.flat = flat;
        
       } 
        
      public Address(int index, String country, String city, // Конструктор исключающий поле класса region.
            String street, String home, int flat){
      this(index, country, null, city, street, home, flat);
      } 
      
      
      public Address(String country, String city, // Конструктор исключающий поле класса region и index.
            String street, String home, int flat){
      this(0, country, null, city, street, home, flat);
      } 
      
    public int getIndex() { // Обьявление методов получения значений полей из класса.
        return index;
    }

    public int getFlat() {
        return flat;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }
    

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHome() {
        return home;
    }
}