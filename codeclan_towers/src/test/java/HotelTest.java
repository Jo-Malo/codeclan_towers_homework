import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;


    @Before
    public void before(){
        hotel = new Hotel("Malo Hotel");
        guest = new Guest("Spike");
        hotel.addGuestToBedroomList(guest);
        hotel.addGuestToConferenceRoomList(guest);
        hotel.addGuestToDiningRoomList(guest);
    }

    @Test
    public void hotelHasName(){
        assertEquals("Malo Hotel", hotel.getName());
    }

    @Test
    public void getNumberOfGuestsInBedrooms(){
        assertEquals(1, hotel.numberOfGuestsInRoom());
    }

    @Test
    public void getNumberOfGuestsInConferenceRoom(){
        assertEquals(1, hotel.numberOfGuestsInConferenceRoom());
    }

    @Test
    public void getNumberOfGuestsInDiningRoom(){
        assertEquals(1, hotel.numberOfGuestsInDiningRoom());
    }

    @Test
    public void canAddGuestToGuestRoom(){
        hotel.addGuestToBedroomList(guest);
        assertEquals(2, hotel.numberOfGuestsInRoom());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        hotel.addGuestToConferenceRoomList(guest);
        assertEquals(2, hotel.numberOfGuestsInConferenceRoom());
    }

    @Test
    public void canAddGuestToDiningRoom(){
        hotel.addGuestToDiningRoomList(guest);
        assertEquals(2, hotel.numberOfGuestsInDiningRoom());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.guestCheckOut();
        assertEquals(1, hotel.numberOfGuestsInRoom());
    }

//    @Test
//    public void getGuestNamesInRoom(){
//        hotel.addGuestToBedroomList(guest);
//        assertEquals("Spike", hotel.guestNamesInRoom());
//    }


}
