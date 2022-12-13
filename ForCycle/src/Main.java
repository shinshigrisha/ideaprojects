import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i = i + 1) {
            for (int b = value; b >= 1; b = b -1) {
                if (i * b == value)
                    System.out.println(i + "*" + b + "=" + value);
            }
        }
    }
}