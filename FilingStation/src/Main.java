public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");

        int fuelType = 678;
        int amount = -98;
        boolean hasDiscount = amount > 10;

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double discount = 0.1;

        int maxAmount = 400;

        String wrongFuelTypeMessage = "Указан неверный вид топлива";

        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92price;
        } else if(fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (hasDiscount) {
            fuelPrice = (1 - discount) * fuelPrice;
        }

        if(amount < 1) {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        }

        if (amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
                    amount = maxAmount;
        }

        String fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб.";

        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}