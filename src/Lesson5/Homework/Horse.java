package Lesson5.Homework;

public class Horse extends Animals{
    public Horse(int limitRun, double limitJump, double limitSwim) {
        super(limitRun, limitJump, limitSwim);
    }

    @Override
    public void run(int length){
        if(length>limitRun) System.out.println("Лошадь не пробежала");
        else{
            System.out.println("Лошадь пробежала");
        }
    }
    @Override
    public void swim(double length){
        if(length>limitRun) System.out.println("Лошадь не проплыла");
        else{
            System.out.println("Лошадь проплыла");
        }
    }
    @Override
    public void jump(double height){
        if(height>limitJump) System.out.println("Лошадь не прыгнула");
        else{
            System.out.println("Лошадь прыгнула");
        }
    }
}
