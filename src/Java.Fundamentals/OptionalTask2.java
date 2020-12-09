/*
Вывести числа в порядке возрастания (убывания) значений их длины.
 */

package sample;

import java.util.*;
import java.util.Map.Entry;
import static java.util.Collections.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class OptionalTask2 {
    public static void main(String[] args) {
        System.out.println("enter quantity of numbers: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n);
        int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
            System.out.print("enter " + i + "- number: ");
            arr[i] = scan.nextInt();
            System.out.println();

        }
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}