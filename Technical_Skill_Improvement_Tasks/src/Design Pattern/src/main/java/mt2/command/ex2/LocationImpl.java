package mt2.command.ex2;

class LocationImpl implements Location{
    private String location;

    public LocationImpl(){ }
    public LocationImpl(String newLocation){
        location = newLocation;
    }

    public String getLocation(){ return location; }

    public void setLocation(String newLocation){ location = newLocation; }

    public String toString(){ return location; }
}
