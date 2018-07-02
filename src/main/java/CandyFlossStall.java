public class CandyFlossStall extends Stall implements ITicketed {

    public CandyFlossStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public double defaultPrice() {
        return 4.20;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }

    public void sellCandyFloss(Visitor visitor) {
        visitor.buy(defaultPrice());
    }
}
