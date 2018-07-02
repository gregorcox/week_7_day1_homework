public interface ITicketed {

    double defaultPrice(double price);
    double priceFor(Visitor visitor);
}
