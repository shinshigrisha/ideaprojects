public class GearBox {
    /**
     * 0 - neutral
     * -1 - real
     * 1-6
     * */
    public static final int MIN_GEAR = 1;
    public static final int MAX_GEAR = 6;
    private int gear = 0;

    public final int type;

    public GearBox(int type) {
        this.type = type;
}
    public void shiftUp() {
        gear = gear < MAX_GEAR ? gear + 1 : gear;
    }

    public void shiftDown() {
        gear = gear > MIN_GEAR ? gear - 1 : gear;
    }

    public void switchRear() {
        gear = (gear > 1) ? gear : -1;
    }

    public void switchNeutral() {
        gear = 0;
    }

    public int getCurrentGear() {
        return gear;
    }
}

