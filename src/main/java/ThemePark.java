import org.w3c.dom.Attr;

import java.util.ArrayList;

public class ThemePark {

    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    ArrayList<IReviewed> reviews;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls, ArrayList<IReviewed> reviews){
        this.attractions = attractions;
        this.stalls = stalls;
        this.reviews = reviews;
    }

    public void visit(Visitor visitor, Attraction attraction){

    }

    public ArrayList<IReviewed> getAllReviews(){
        for (attraction : attractions) {
            reviews.add(attractions.rating());
        }
    }




}
