package Lesson4.online;

/*
1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
2 Конструктор класса должен заполнять эти поля при создании объекта;
3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
4 Вывести при помощи методов из пункта 3 ФИО и должность.
5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
 */
public class MainClass {
    public static void main(String[] args) {

// 2 Конструктор класса должен заполнять эти поля при создании объекта;
        Person person = new Person("Иванов Иван Иванович", "инженер", "+7(987)456-23-03", 35000, 47);

//4 Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println(person.getFIO() + " " + person.getPosition());
// 5 Создать массив из 5 сотрудников.
        Person[] personMas = new Person[5];
// 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер ID.
        personMas[0] = new Person("Кривошеева Татьяна Павловна", "менеджер", "+7(917)471-14-45", 20000, 20, Person.setID());
        personMas[1] = new Person("Милютина Анастасия Сергеевна", "ведущий менеджер", "+7(919)564-29-65", 45000, 38, Person.setID());
        personMas[2] = new Person("Петров Петр Петрович", "специалист СПП", "+7(937)431-78-22", 30000, 27, Person.setID());
        personMas[3] = new Person("Васильев Василий васильевич", "бухгалтер", "+7(927)888-52-15", 37000, 44, Person.setID());
        personMas[4] = new Person("Сидоров Сидор Сидорович", "директор", "+7(905)777-77-77", 50000, 50, Person.setID());

// С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
        for (int i = 0; i < personMas.length; i++) {
            if (personMas[i].getAge() > 40)
                System.out.println("ID: "+personMas[i].getID() + " ФИО " + personMas[i].getFIO() + "должность " + personMas[i].getPosition()+"телефон "+ personMas[i].getTelephone()+"зарплата "+ personMas[i].getSalary()+"возраст "+ personMas[i].getAge() );

        }

        increaseSalary(personMas);
        for (int i = 0; i < personMas.length; i++) {
            System.out.println("ФИО "+personMas[i].getFIO() + " зарплата: " + personMas[i].getSalary());
        }
    }

// 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
    private static void increaseSalary(Person[] person) {
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 35)
                person[i].setSalary();
        }

    }

}
