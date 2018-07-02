public class TobaccoStall extends Stall implements ISecurity, ITicketed {

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating){
        super(name, ownerName, parkingSpot, rating);

    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 18) {
            return true;
        } else {
            return false;
        }
    }

    public double defaultPrice() {
        return 6.60;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }

    public void sellTobacco(Visitor visitor) {
        if (isAllowedTo(visitor)) {
            visitor.buy(defaultPrice());
        }
    }

    public int getRating(){
        return rating;
    }
}
