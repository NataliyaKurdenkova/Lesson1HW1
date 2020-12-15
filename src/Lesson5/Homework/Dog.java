package Lesson5.Homework;

public class Dog extends Animals{
    public Dog(int limitRun, double limitJump, double limitSwim) {
        super(limitRun, limitJump, limitSwim);
    }

    @Override
    public void run(int length){
        if(length>limitRun) System.out.println("Собака не пробежала");
        else{
            System.out.println("Собака пробежала");
        }
    }
    @Override
    public void swim(double length){
        if(length>limitRun) System.out.println("Собака не проплыла");
        else{
            System.out.println("Собака проплыла");
        }
    }
    @Override
    public void jump(double height){
        if(height>limitJump) System.out.println("Собака не прыгнула");
        else{
            System.out.println("Собака прыгнула");
        }
    }
}
