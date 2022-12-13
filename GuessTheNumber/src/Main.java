import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int attempt = new Scanner(System.in).nextInt();
        int currentNumber = 56;

        while (true) {
            if (attempt == currentNumber) {
                System.out.println("Вы угадали!");
                break;
            }
            if (attempt > currentNumber) {
                System.out.println("Загаданное число меньше");
                break;
            }
            if (attempt < currentNumber) {
                System.out.println("Загаданное число больше");
                break;
            }
        }

    }
}