package Lesson5.Homework;

/*
(бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
 */
public class MainClassZoo {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Птица", 5, 0.3, 0);

        Cat cat1 = new Cat("Кот", 200, 2, 0);


        Dog dog1 = new Dog("Собака 1", 500, 0.5, 10);
        Dog dog2 = new Dog("Собака 2", 500, 0.5, 10);
        Horse horse1 = new Horse("Лошадь", 1500, 3, 100);

        Animals[] animals1 = {bird1, cat1, dog1, dog2, horse1};
        for (int i = 0; i < animals1.length; i++) {
            System.out.println(animals1[i].name + " " + animals1[i].jump(0.2));
            System.out.println(animals1[i].name + " " + animals1[i].swim(2));
            System.out.println(animals1[i].name + " " + animals1[i].run(10));
        }

    }
}
