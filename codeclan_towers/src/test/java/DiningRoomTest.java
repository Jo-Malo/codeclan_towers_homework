import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Room room;
    Guest guest;

    @Before
    public void before(){
        diningRoom = new DiningRoom(10);
    }

    @Test
    public void diningRoomHasCapacity(){
        assertEquals(10, diningRoom.getCapacity());
    }

    @Test
    public void conferenceRoomHasGuests(){
        assertEquals(0, diningRoom.getNumberOfGuests());
    }

    @Test
    public void removeGuests(){
        diningRoom.addGuest(guest);
        diningRoom.removeGuest(guest);
        assertEquals(0, diningRoom.getNumberOfGuests());
    }
}
