/*
Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

package sample;

import java.util.Scanner;

public class MainTask5 {
    static void setMonth(int a) {
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String s;
        try {
            s = month[a - 1];
            System.out.println("That month is " + s + ".");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid month");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of the month: ");
        int n = sc.nextInt();
        setMonth(n);
    }
}