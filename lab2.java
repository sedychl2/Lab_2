import java.util.InputMismatchException;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
    try {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество элементов последовательности: ");
        int n = s.nextInt();
        int sequence = 5;
        if (n < 0) {
            System.out.println("Ошибка ввода. Введите положительное число.");
            System.exit(1);
        } else {
            for (int i = 0; i < n; i++) {
                sequence -= 5;
                System.out.println(sequence);
                }
            }
} catch (InputMismatchException e) {
    System.out.println("Ошибка ввода. Введите целое число.");
    System.exit(1);
        }
    }
}