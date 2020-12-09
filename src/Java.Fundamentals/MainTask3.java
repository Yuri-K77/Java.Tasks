/*
Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
 */

package sample;

public class MainTask3 {
    public static void main(String[] args) {
       int a = 0;
       int b = 100;
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.println(random_number1);
        }
    }
}