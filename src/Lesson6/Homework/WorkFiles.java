package Lesson6.Homework;


import java.io.*;

/*
Домашнее задание Java1. Level1. Step6
1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
4. ** Написать метод, проверяющий, есть ли указанное слово в папке
 */
public class WorkFiles {
    public static void main(String[] args) {
        writeFiles();
        glueFiles();
        String word="programm";
        String[] nameFile={"File2.txt","File.txt","File3.txt"};
        for (int i=0;i<nameFile.length;i++)
        System.out.println("Слово "+ word+" в тексте файла "+nameFile[i]+" найдено: "+ searchWord(nameFile[i],word));
    }

    public static boolean searchWord(String name, String word) {
        try {
            FileInputStream fis4 = new FileInputStream(name);
            StringBuilder word1=new StringBuilder();
            int outboxI;
              while ((outboxI = fis4.read()) != -1) {
                word1.append((char)outboxI);

            }fis4.close();
 //           System.out.println(word1.toString());
            int indexJava = word1.indexOf(word);
            if(indexJava != - 1) {
                return true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return false;
    }


    public static void writeFiles() {
        try {
            // создаем 1 файл и  записываем в него
            FileOutputStream fos1 = new FileOutputStream("File.txt");
            PrintStream ps = new PrintStream(fos1);
            ps.println("1program dfmgndfgdfnf dffhdfj dfjdfkhgd dfkbhfjkfgjfhdj dfkbhfjbhcvj gjkfdgd. dklhgjgh progra1");
            ps.close();
            fos1.flush();
            fos1.close();
            System.out.println("1 файл создан");
            //создаем 2 файл и записываем в него
            FileOutputStream fos2 = new FileOutputStream("File2.txt");
            PrintStream ps2 = new PrintStream(fos2);
            ps2.println("2prog prog prog prog mfcb.bvmcbmzcbnmnprogrammcmvbm,bncv2");
            ps2.close();
            fos2.flush();
            fos2.close();
            System.out.println("2 файл создан");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void glueFiles() {
// считываем все из 1 и 2 файлов
        try {
            FileInputStream fis1 = new FileInputStream("File.txt");
            FileInputStream fis2 = new FileInputStream("File2.txt");

            int outboxI;
            //для склеивания используем StringBuilder
            StringBuilder sb1 = new StringBuilder();
//считываем данные 1 го файла и добавляем в sb1
            while ((outboxI = fis1.read()) != -1) {
                sb1.append((char) outboxI);

            }

            outboxI = 0;
// считываем данные из 2 файла и добавляем также в sb1, чтобы склеить данные
            while ((outboxI = fis2.read()) != -1) {
                sb1.append((char) outboxI);

            }
//            System.out.println(sb1.toString());
            //создаем 3 файли пишем то, что получилось в sb1
            FileOutputStream fos3 = new FileOutputStream("File3.txt");
            PrintStream ps2 = new PrintStream(fos3);
            ps2.println(sb1.toString());
            ps2.close();
            fos3.flush();
            fos3.close();
            fis1.close();
            fis2.close();
            System.out.println("Содержимое 1 -го и 2-го файла записаны в 3 файл");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
