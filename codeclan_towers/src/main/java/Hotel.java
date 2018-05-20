import java.util.ArrayList;

public class Hotel {

    private String name;
    private int capacity;
    ArrayList<Guest> bedroomList;
    ArrayList<Guest> conferenceRoomList;
    ArrayList<Guest> diningRoomList;

    public Hotel(String name){
        this.bedroomList = new ArrayList<>();
        this.conferenceRoomList = new ArrayList<>();
        this.diningRoomList = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName(){
        return this.name;
    }

//    public boolean isFull(){
//        return bedroomList.size() >= this.capacity;
//    }

    public int numberOfGuestsInRoom(){
        return bedroomList.size();
    }

    public int numberOfGuestsInConferenceRoom(){
        return conferenceRoomList.size();
    }

    public int numberOfGuestsInDiningRoom(){
        return diningRoomList.size();
    }

    public void addGuestToBedroomList(Guest guest) {
//        if (!isFull()) {
            this.bedroomList.add(guest);
//            this.name += guest.getName();
        }
//    }

    public void addGuestToConferenceRoomList(Guest guest){
        this.conferenceRoomList.add(guest);
    }

    public void addGuestToDiningRoomList(Guest guest){
        this.diningRoomList.add(guest);
    }

    public Guest guestCheckOut(){
        return this.conferenceRoomList.remove(0);
    }

//        public ArrayList<Guest> guestNamesInRoom(){
//        return bedroomList;
//    }
//
    public Guest guestNamesInRoom(){
        for (Guest name : bedroomList)
            return name;
        return null;
    }

//    public int guestNamesInRoom(){
//        for (Guest guest : bedroomList) {
//            for (int i = 0; i < bedroomList.size(); i++)
//                return guest();
//        }
//    }



}


