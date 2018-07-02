public class CandyFlossStall extends Stall implements ITicketed, IReviewed {

    public CandyFlossStall(String name, String ownerName, int parkingSpot, int rating){
        super(name, ownerName, parkingSpot, rating);
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

    public int getRating(){
        return rating;
    }
}
