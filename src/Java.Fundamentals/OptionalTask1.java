/*
Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

package sample;

public class OptionalTask1 {
    public static void main(String[] args) {
        int array[] = new int[]{5, 10, 76, 102, 321, 985};
        int min = getMin(array);// Вызов метода getMin () для получения минимального значения
        System.out.println("Minimum number is: " + min);
        int max = getMax(array);// Вызов метода getMax () для получения максимального значения
        System.out.println("Maximum number is: " + max);
    }
    //Минимальное значение
    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for(int i = 1;i < inputArray.length; i++) {
            if(inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    //Максимальное значение
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for(int i = 1;i < inputArray.length; i++) {
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }
}