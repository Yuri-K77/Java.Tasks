/*
Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 */

/*/package sample;

public class MainTask4 {
    public static void main(String[] args) {
        //Scanner vvod = new Scanner(System.in);
        int count = args.length();
        int sum = 0;
        int multi = 1;
        for (int i = 0; i < count; i++) {
            int variable = args[i].toInteger();
            sum = sum + variable;
            multi = multi * variable;
            System.out.println("count " + count);
            System.out.println("Summ= " + sum);
            System.out.println("Multiplication= " + multi);
        }
    }
}*/