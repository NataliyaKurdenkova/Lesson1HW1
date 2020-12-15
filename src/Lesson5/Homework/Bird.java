package Lesson5.Homework;
/*
(бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
 */
public class Bird extends Animals{
   public Bird(int limitRun,double limitJump,double limitSwim){
       super(limitRun,limitJump,limitSwim);



   }
    @Override
    public void run(int length){
        if(length>limitRun) System.out.println("Птица не пробежала");
        else{
            System.out.println("Птица пробежала");
        }
    }


    @Override
    public void swim(double length){
        System.out.println("Птицы плавать не умеют");
    }
    @Override
    public void jump(double height){
        if(height>limitJump) System.out.println("Птица не прыгнула");
        else{
            System.out.println("Птица прыгнула");
        }
    }
}
