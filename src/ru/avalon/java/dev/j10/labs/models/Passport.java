package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

import java.time.LocalDate;


public class Passport {          // Объявлен класс Паспорт.
    private int passportNumber;    // Объявление полей(переменных) класса - номер паспорта
    private int passportSeria;   // Серия паспорта
    private String name;          // Имя
    private String surname;       // Фамилия
    private String fathername;    // Отчество
    private String secondName;    // Второе имя
    private LocalDate birthday;    // Дата рождения
    private LocalDate dateOfIssuing;  // Дата выдычи
   

    public Passport(int passportNumber, int passportSeria, String name,
            String surname,String fathername, String secondName,
            LocalDate birthday, LocalDate dateOfIssuing) {  // Обьявлен конструктор для инициализации переменных - безсмысленный комментарий
        this.passportNumber = passportNumber; // Инициализация переменных. - безсмысленный комментарий
        this.passportSeria = passportSeria;
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.secondName = secondName;
        this.birthday = birthday;
        this.dateOfIssuing = dateOfIssuing;
        /*  TODO (Проверка№2 ЛР№1)
            - Добавить коментарии ко всем  полям и методам класса!
        */
       
    }

    public Passport(int passportNumber, int passportSeria, String name,
            String surname,String fathername,  // Перегруженный конструктор с отсутствием второго имени. - 
            LocalDate birthday, LocalDate dateOfIssuing){
    this(passportNumber, passportSeria, name, surname, fathername, null, birthday, dateOfIssuing);
    
    }
    public Passport(int passportNumber, int passportSeria, String name,
            String surname,  // Перегруженный конструктор с отсутствием отчества и второго имени.
            LocalDate birthday, LocalDate dateOfIssuing){
    this(passportNumber, passportSeria, name, surname, null, birthday, dateOfIssuing);
    }
    
    /*  TODO (Проверка№3 ЛР№1)
        - Добавить коментарии ко всем методам класса - это означает надо описать действие метода,
        а не описывать его устройство, нас интересует что он может делать.
        Например: нахождение максимального числа, получение поля index, конструктор со всеми параметрами!
        Конструкторы и гетеры тоже надо подписывать, сразу становиться ясно что он делает!
        - Ставь комментарии перед конструкторами и методами, тогда они легче читаются!
    */

    public int getPassportNumber() {   // Обьявление методов получения значений полей из класса.
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

   
}
