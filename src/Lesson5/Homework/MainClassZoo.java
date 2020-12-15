package Lesson5.Homework;

/*
(бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
 */
public class MainClassZoo {
    public static void main(String[] args) {
        Bird bird1 = new Bird(5,  0.3, 0);
        /*bird1.jump(3.0);
        bird1.run(1);
        bird1.swim(6.0);*/

        Cat cat1 = new Cat(200, 2, 0);
       /* cat1.jump(3.0);
        cat1.run(1);
        cat1.swim(6.0);*/

        Dog dog1 = new Dog(500, 0.5, 10);
       /* dog1.jump(3.0);
        dog1.run(1);
        dog1.swim(6.0);*/
        Dog dog2  = new Dog(500, 0.5, 10);
        Horse horse1 = new Horse(1500, 3, 100);
        /*horse1.jump(3);
        horse1.run(1);
        horse1.swim(6);*/

        Animals[] animals1 = {bird1, cat1, dog1,dog2, horse1};
        for (int i = 0; i < animals1.length; i++) {
            animals1[i].jump(0.2);
            animals1[i].swim(2);
            animals1[i].run(10);

       }

    }
}
