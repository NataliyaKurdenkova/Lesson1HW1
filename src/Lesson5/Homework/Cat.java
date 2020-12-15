package Lesson5.Homework;

public class Cat extends Animals {
    public Cat(int limitRun, double limitJump, double limitSwim)
    {
        super(limitRun, limitJump, limitSwim);

    }
    @Override
    public void run(int length){
        if(length>limitRun) System.out.println("Кот не пробежал");
        else{
            System.out.println("Кот пробежал");
        }
    }
    @Override
    public void swim(double length){
        System.out.println("Коты плавать не умеют");
    }
    @Override
    public void jump(double height){
        if(height>limitJump) System.out.println("Кот не прыгнул");
        else{
            System.out.println("Кот прыгнул");
        }
    }
}
