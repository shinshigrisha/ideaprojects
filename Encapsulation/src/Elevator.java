public class Elevator {
    public int currentFloor = 1;
    private final int maxFloor;
    private final int minFloor;
    public Elevator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveUp() {
        currentFloor += 1;
    }
    public void moveDown() {
        currentFloor -= 1;
    }
    public void move(int floor) {
        if (floor == currentFloor) {
            System.out.println("Вы выбрали этаж, на котором находитесь");
        } else if (floor > maxFloor || floor < minFloor || floor == 0) {
            System.out.println("Выбран неверный этаж");
        } else {
            if (currentFloor < floor) {
                for (int i = currentFloor; floor > currentFloor; moveUp()) {
                    System.out.println(getCurrentFloor());
                }
                System.out.println("Вы на " + currentFloor + " этаже");
            }
            if (currentFloor > floor) {
                for (int i = currentFloor; floor < currentFloor; moveDown()) {
                    System.out.println(getCurrentFloor());
                }
                System.out.println("Вы на " + currentFloor + " этаже");
            }
        }
    }
}

