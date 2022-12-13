public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1;


        boolean isBlocked = true;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        boolean milkIsEnough = skimmedMilkAmount >= cappucinoCoffeeRequired ||
                milkAmount >= cappucinoMilkRequired;

        boolean coffeeIsEnough = coffeeAmount >= cappucinoCoffeeRequired;

        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
            hasErrors = true;
        }

        if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;
        }

        if (!milkIsEnough) {
            System.out.println("Молока недостаточно");
            hasErrors = true;
        }

        if (!hasErrors){
            System.out.println("Готовим кофе");
        }
    }
}