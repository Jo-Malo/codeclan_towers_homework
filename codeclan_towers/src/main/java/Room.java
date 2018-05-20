import java.util.ArrayList;

public abstract class Room {

    private BedroomType bedroomType;
    private int capacity;
    public ArrayList<Guest> guests;

    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){
        return capacity;
    }

    public int getNumberOfGuests(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }

}
