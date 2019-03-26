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

    /*public String getName() {
        return name;
    }*/
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

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
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

        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        return null;
    }

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress(){ //Метод получения из класса значения полей.

        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return address.getIndex() + " " + address.getCountry()
                + " " + address.getCity() + " " + address.getStreet() + " "
                + address.getHome() + " " + address.getFlat();
    }
}