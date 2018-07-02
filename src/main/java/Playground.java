public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating){
        super(name, rating);
    }

    public int getRating(){
        return rating;
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() <= 15) {
            return true;
        } else {
            return false;
        }
    }

    public void allowEntry(Visitor visitor){
        if (isAllowedTo(visitor)){
            return;
        }
    }
}
