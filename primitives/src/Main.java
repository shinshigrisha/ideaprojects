public class Main {
    public static void main(String[] args) {
        Integer productsCount = 3_362_000;

        Integer productsCountCopy = productsCount;

        productsCount = productsCount - 362_000;

        System.out.println(productsCount);
    }
}