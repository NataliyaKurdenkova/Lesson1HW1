package Lesson5.Homework;

/*
(бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
 */
public class Bird extends Animals {
    public Bird(String name, int limitRun, double limitJump, double limitSwim) {
        super(name, limitRun, limitJump, limitSwim);
    }

    @Override
    public String swim(double length){
        return "плавать не умеет";
    }


}

