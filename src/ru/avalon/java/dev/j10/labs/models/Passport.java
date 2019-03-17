package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

import java.time.LocalDate;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 * <li> серию и номер документа;
 * <li> имя;
 * <li> фамилию;
 * <li> отчество;
 * <li> второе имя;
 * <li> день рождения;
 * <li> дату выдачи;
 * <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    private int passportNumber;
    private int passportSeria;
    private String name;
    private String surname;
    private String fathername;
    private String secondName;
    private LocalDate birthday;
    private LocalDate dateOfIssuing;
    private Address address;

    public Passport(int passportNumber, int passportSeria, String name, String surname,
                    String fathername, String secondName, LocalDate birthday, LocalDate dateOfIssuing,
                    Address address) {
        this.passportNumber = passportNumber;
        this.passportSeria = passportSeria;
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.secondName = secondName;
        this.birthday = birthday;
        this.dateOfIssuing = dateOfIssuing;
        this.address = address;
    }

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */

    public int getPassportNumber() {
        return passportNumber;
    }

    public int getPassportSeria() {
        return passportSeria;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFathername() {
        return fathername;
    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public LocalDate getDateOfIssuing() {
        return dateOfIssuing;
    }

    public Address getAddress() {
        return address;
    }
}
