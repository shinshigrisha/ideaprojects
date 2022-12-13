import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentNumber = 00;

            System.out.println("Добро прожаловать в Гей-Детектор 2022");
            System.out.println("Введите свое имя");
            System.out.println("Ваше любимое число");
            int luckyNumber = new Scanner(System.in).nextInt();

            if (luckyNumber == currentNumber) {
                System.out.println("Поздравляю вы натурал!!!");
            } else {
                System.out.println("Сожалею вы гей!!!");
            }
    }
}