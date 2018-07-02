public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    public Rollercoaster(String name, int rating){
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 12 && visitor.getHeight() > 145) {
            return true;
        } else {
            return false;
        }
    }

    public double defaultPrice(){
        return 8.40;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getHeight() > 200) {
            return defaultPrice() * 2;
        } else {
            return defaultPrice();
        }
    }

    public int getRating(){
        return rating;
    }

    public void sellTicket(Visitor visitor){
        if (isAllowedTo(visitor)) {
            visitor.buy(priceFor(visitor));
        }
    }


}
