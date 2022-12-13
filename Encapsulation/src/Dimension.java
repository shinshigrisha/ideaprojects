public class Dimension {
    private final int depthCargo;
    private final int lengthCargo;

    private final int heightCargo;

    public Dimension(int depthCargo, int lengthCargo, int heightCargo) {
        this.depthCargo = depthCargo;
        this.lengthCargo = lengthCargo;
        this.heightCargo = heightCargo;
    }
    public Dimension dimension(int depthCargo, int lengthCargo, int heightCargo) {
        return new Dimension(depthCargo, lengthCargo, heightCargo);
    }
    public int getDimention() {
        return depthCargo+lengthCargo+heightCargo;
    }
}
