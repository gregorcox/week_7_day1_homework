import org.w3c.dom.Attr;

import java.util.ArrayList;

public class ThemePark {

    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls){
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public void visit(Visitor visitor, Attraction attraction){

    }

}
