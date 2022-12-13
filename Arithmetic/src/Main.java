public class Main {
    public static void main(String[] args) {
        Arithmetic calculation = new Arithmetic(7, 58);

        System.out.println("Сумма чисел: " + calculation.sum());
        System.out.println("Произведение чисел: " + calculation.multiply());
        System.out.println("Наибольшее число: " + calculation.max());
        System.out.println("Наименьшее число: " + calculation.min());
    }
}