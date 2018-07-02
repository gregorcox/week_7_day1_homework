public abstract class Stall {

    public String name;
    public String ownerName;
    public int parkingSpot;
    public int rating;

    public Stall(String name, String ownerName, int parkingSpot, int rating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public int getParkingSpot(){
        return parkingSpot;
    }
}
