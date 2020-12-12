package Lesson4.online;
/*
1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
 */
public class Person {
    private static int count=0;
    private String FIO;
    private String position;
    private String telephone;
    private int salary;
    private int age;
    private int personID;


    Person(String FIO, String position, String telephone, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    Person(String FIO, String position, String telephone, int salary, int age,int personID) {
        this.FIO = FIO;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
        this.personID = personID;
    }
    /*
3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
*/

    public String getFIO() {
        return FIO;
    }

    public String getPosition() {
        return position;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
    public int getID() {
        return personID;
    }
    public int setSalary() {
        return this.salary+=10000;
    }

    public static int setID() {
        return count++;
    }
}
