 
/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */


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
            String street, String home, int flat) // Обьявлен метод для инициализации переменных 
    {
        this.index = index;
        this.country = country;// Инициализация переменных.
        this.region = region;
        this.city = city;
        this.street = street;
        this.home = home;
        this.flat = flat;
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