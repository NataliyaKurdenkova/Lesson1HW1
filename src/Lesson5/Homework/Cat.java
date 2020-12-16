package Lesson5.Homework;

public class Cat extends Animals {
    public Cat(String name,int limitRun, double limitJump, double limitSwim)
    {
        super(name,limitRun, limitJump, limitSwim);

    }

    @Override
    public String swim(double length){
        return "плавать не умеет";
    }

}
