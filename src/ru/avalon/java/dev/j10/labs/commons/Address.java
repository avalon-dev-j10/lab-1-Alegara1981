 
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

public class Address{
    private int index;
    private String country;
    private String city;
    private String street;
    private String home;
    private int flat;

    public Address(int index, String country, String city, String street, String home, int flat) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.home = home;
        this.flat = flat;
    }
    
    /*  TODO (Проверка №1)
        Можно добавить поля - Область, корпус
        Добавить коментарии к полям и методам класса
    
        Создать несклолько перегрушеных конструкторов (с меньшим количеством
        параметров)
    */

    public int getIndex() {
        return index;
    }

    public int getFlat() {
        return flat;
    }

    public String getCountry() {
        return country;
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