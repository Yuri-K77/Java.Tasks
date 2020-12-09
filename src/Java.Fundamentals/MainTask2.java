/*
Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class MainTask2 {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println("arg № " + (i + 1) + args[i]); //вывод каждого значения на новой строке
        }
    }
}