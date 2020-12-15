package Lesson5.Homework;
/*
Домашнее задание Java1. Level1. Step5
1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.

2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.

В качестве параметра каждому методу передается величина, означающая или длину препятствия
(для бега и плавания), или высоту (для прыжков).

3. У каждого животного есть ограничения на действия

(бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
 (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
*/

import java.util.Random;

public abstract class Animals {

    protected int limitRun;
    protected double limitSwim;
    protected double limitJump;
    public static final Random RANDOM = new Random();

    public Animals(int limitRun,double limitJump,double limitSwim) {
        this.limitRun=RANDOM.nextInt(limitRun);
        this.limitJump= (limitJump != 0) ? RANDOM.nextDouble()*limitJump : limitJump;
        this.limitSwim= (limitSwim != 0) ? RANDOM.nextDouble()*limitSwim : limitSwim;
    }

    public abstract void run(int length);

    public abstract void jump(double height);

    public abstract void swim(double length);

}

