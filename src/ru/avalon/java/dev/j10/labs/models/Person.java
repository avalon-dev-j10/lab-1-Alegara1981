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

   
    
    public String getAddress(){ //Метод получения из класса значения полей.

     
        return address.getIndex() + " " + address.getCountry()
                + " " + address.getCity() + " " + address.getStreet() + " "
                + address.getHome() + " " + address.getFlat();
    }
}
