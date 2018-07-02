public class IceCreamStall extends Stall implements ITicketed {

    public IceCreamStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public double defaultPrice() {
        return 2.80;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }
}
