public class CargoParameters {
    private final Dimension dimension;

    private final int cargoWeight;
    private final String deliveryAddress;
    private final boolean cargoFlip;
    private final String registryNumber;
    private final boolean cargoFragile;
    public CargoParameters(Dimension dimension, int cargoWeight, String deliveryAddress, boolean cargoFlip, String registryNumber, boolean cargoFragile) {
        this.dimension = dimension;
        this.cargoWeight = cargoWeight;
        this.deliveryAddress = deliveryAddress;
        this.cargoFlip = cargoFlip;
        this.registryNumber = registryNumber;
        this.cargoFragile = cargoFragile;
    }
    public CargoParameters setCargoParameters(Dimension dimension, int cargoWeight, String deliveryAddress, boolean cargoFlip, String registryNumber, boolean cargoFragile) {
        return new CargoParameters(dimension, cargoWeight, deliveryAddress, cargoFlip, registryNumber, cargoFragile);
    }

    public int getCargoWeight() {
        return cargoWeight;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public String getRegistryNumber() {
        return registryNumber;
    }
    public boolean isCargoFlip() {
        return cargoFlip;
    }
    public boolean isCargoFragile() {
        return cargoFragile;
    }
    public String toString() {
        return "Обьем: " + dimension.getDimention() + " м³" + "\n" + "Вес: " + getCargoWeight() + " кг." + "\n"
                + "Адрес доставки: " + getDeliveryAddress() + "\n" + "Регистрационный номер: " + getRegistryNumber() +
                "\n" + "Можно переворачивать: " + isCargoFlip() + "\n" + "Является хрупким: " + isCargoFragile();
    }
}
