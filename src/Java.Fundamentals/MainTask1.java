/*
Приветствовать любого пользователя при вводе его имени через командную строку.
 */

import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите Ваше имя - ");
        Scanner vvod = new Scanner(System.in);
        String name = vvod.nextLine();
        System.out.println("Приятно познакомиться, " + name);
   }
}