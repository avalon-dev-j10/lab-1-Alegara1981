package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;


public class Person {            // Объявлен класс.
    private Passport passport; // Объявление полей(переменных) класса с типом класса Паспорт и Адрес
    private Address address;

    public Person(Passport passport, Address address) {
        this.passport = passport; // Инициализация переменных
        this.address = address;
    }

    public Passport getPassport() {  // Метод получения из класса значения полей.
        return passport;
    }

    
    public String getFullName() { // Метод получения полей использующий в своей реализации оператор условия.
        if (passport.getName() != null && passport.getSurname() != null && passport.getFathername() != null) {
            return passport.getName() + " " + passport.getSurname() + " " + passport.getFathername();
        }
        if (passport.getFathername() == null && passport.getSecondName() != null) {
            return passport.getName() + " " + passport.getSecondName().substring(0, 1) + "." + " " +
                    passport.getSurname();
        }
        if (passport.getFathername() == null && passport.getSecondName() == null && passport.getName() != null &&
                passport.getSurname() != null) {
            return passport.getName() + " " +  passport.getSurname();
        }

    
        return "";
        
        /*  TODO (Проверка№2 ЛР№1)
            - Если ни одно из условий не выполниться, метод  вернет  значение null!
            Исправить!
        */
    }

    /*  TODO (Проверка№3 ЛР№1)
        - Добавить коментарии ко всем методам класса - это означает надо описать действие метода,
        а не описывать его устройство, нас интересует что он может делать.
        Например: нахождение максимального числа, получение поля index!
        Конструкторы и гетеры тоже надо подписывать, сразу становиться ясно что он делает!
        - У тебя большинство комментариев не вносят ясности в программу, вот нижний метод
        getAddress я бы описал просто - Получение адреса объекта Person!
        - Ставь комментарии перед конструкторами и методами, тогда они легче читаются!
    */
    
    public String getAddress(){ // Получение адреса объекта Person

     
        return address.getIndex() + " " + address.getCountry()
                + " " + address.getCity() + " " + address.getStreet() + " "
                + address.getHome() + " " + address.getFlat();
    }
}
