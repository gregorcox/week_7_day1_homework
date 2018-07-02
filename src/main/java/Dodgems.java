public class Dodgems extends Attraction implements ITicketed, IReviewed {

    public Dodgems(String name, int rating){
        super(name, rating);
    }

    public double defaultPrice(){
        return 4.50;
    }

    public int getRating(){
        return rating;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge() < 12){
            return defaultPrice() / 2;
        } else {
            return defaultPrice();
        }
    }

    public void sellTicket(Visitor visitor){
        visitor.buy(priceFor(visitor));
    }
}
