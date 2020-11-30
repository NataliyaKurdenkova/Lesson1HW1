
public class Project2 {
    public static void main(String[] args){
        System.out.println("Результат вычисления: "+formula(3,15,1,5));
        int x=51;
        int y=13;
        System.out.println("Числа "+ x+ " и " + y+ " лежат в диапазоне от 10 до 20 - "+rangeXY(x, y));
        positiveOrNegative(-19);
        hiUser("Наталия");
        leapYearOrNot(2020);
    }



// метод, определяющий являеется год високосным или нет
// каждый 4 -год  високосный, кроме каждого 100-го, при этом каждый 400-й високосный.
// для проверки работы вывести результаты работы в консоль
 private static void leapYearOrNot(int year) {
     if ((year % 4 != 0) || (year % 100 == 0) && (year % 400 != 0)) {
         System.out.println("Год обычный");

     } else System.out.println("Год високосный");
 }

//метод, которому в качестве параметра передается строка,
// обозначающая имя, метод должен вернуть приветственное сообщение "Привет, переданное имя!"
// Вывести приветственное сообщение в консоль
private static void hiUser(String name){
        System.out.println("Привет, "+ name+ "!" );
}


//метод, которому в качестве параметра передается целое число.
// метод должен проверить положительное число передали или отрицательное
// ( 0- положительное число)
 private static void positiveOrNegative(int chislo){
         if(chislo>=0)
            System.out.println(chislo+" - положительное");
         else
             System.out.println(chislo+" - отрицательное");
 }

//метод, принимающий на вход 2 целых числа,
// и проверяющий, что их сумма лежит в пределах от 10 до 20 включительно
    private static boolean rangeXY(int x,int y){
        int sum=x+y;
        if((sum>10)&&(sum<=20)){
            return true;
        }
        else return false;
    }

    // метод, вычисляющий выражение a*(b+(c/d))
    // и возвращающий результат с плавающей точкой,
    // где a,b,c,d - целочисленные входные параметры этого метода
    private static float formula(int a,int b,int c,int d){
        return  (a*(b+(c/(float)d)));
    }
}
