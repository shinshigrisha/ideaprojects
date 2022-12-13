import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Dimension cargoDimension = new Dimension(16, 12, 9);
        Dimension copyCargoDimension = cargoDimension.dimension(675,87,87);

        System.out.println("Проверка обьекта класса Dimension");
        System.out.println();
        System.out.println("Первоначальный обьект: " + "\n" + "Обьем груза: " + cargoDimension.getDimention() + " м³");
        System.out.println();
        System.out.println("Созданная копия: " + "\n" + "Обьем груза: " + copyCargoDimension.getDimention() + " м³");
        System.out.println();

        CargoParameters cargo = new CargoParameters(cargoDimension.dimension(67,78,4567), 567, "ул. Киевская",  false,"RYU89876", false);
        CargoParameters copyCargo = cargo.setCargoParameters(cargoDimension.dimension(67,78,78), 456, "ул.Одесская", true, "TYU8765", true );

        System.out.println("Проверка обьекта класса CargoParameters:");
        System.out.println();
        System.out.println("Первоначальный обьект:" + "\n" + cargo.toString() + "\n");
        System.out.println();
        System.out.println("Созданная копия: " + "\n" + copyCargo.toString() + "\n");

        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }
}