package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.models.Person;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Passport ivanonPassport = new Passport(8797, 554, "Иван",
                "Иванов", "Иванович", null,
                LocalDate.of(1981, 10, 23),LocalDate.of(1999, 10,10));
        Address ivanovAddress = new Address(987, "USA", null, "Brooklin", "avenue", "12i",
                13);
        Person ivanov = new Person(ivanonPassport, ivanovAddress);

        Passport smithPassport = new Passport(6969, 456, "John",
                "Smith", null, "Edward",
                LocalDate.of(1980, 9, 20),LocalDate.of(1999, 8,9));
        Address smithAddress = new Address(789, "Russia", "Moscows region", "Moscow", "Lenina", "10i",
                10);
        Person smith = new Person(smithPassport, smithAddress);

        String nameIvanov = ivanov.getFullName();
        System.out.println(nameIvanov);
        String smithIvanov = smith.getFullName();
        System.out.println(smithIvanov);
        String addressIvanov = ivanov.getAddress();
        System.out.println(addressIvanov);
        String addressSmith = smith.getAddress();
        System.out.println(addressSmith);

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
