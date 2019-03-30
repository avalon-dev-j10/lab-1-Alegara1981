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
   
    // Конструктор инициализации полей класса.
    public Passport(int passportNumber, int passportSeria, String name,
            String surname,String fathername, String secondName,
            LocalDate birthday, LocalDate dateOfIssuing) {  
        this.passportNumber = passportNumber; 
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
            String surname,String fathername,  // Перегруженный конструктор с отсутствием второго имени.
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

    public int getPassportNumber() {   // Метод получения значений полей из класса - номер паспорта
        return passportNumber;
    }

    public int getPassportSeria() { // Метод получения значений полей из класса - серия паспорта
        return passportSeria;
    }

    public String getName() { // Метод получения значений полей из класса - имя
        return name;
    }

    public String getSurname() {  // Метод получения значений полей из класса - фамилия
        return surname;
    }

    public String getFathername() {  // Метод получения значений полей из класса - отчесство
        return fathername;
    }

    public String getSecondName() {  // Метод получения значений полей из класса - второе имя
        return secondName;
    }

    public LocalDate getBirthday() {  // Метод получения значений полей из класса - день рождения
        return birthday;
    }

    public LocalDate getDateOfIssuing() {  // Метод получения значений полей из класса - дата получения
        return dateOfIssuing;
    }

   
}
